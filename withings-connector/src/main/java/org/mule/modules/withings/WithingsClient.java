package org.mule.modules.withings;


import javax.ws.rs.core.MediaType;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

import com.sun.jersey.api.client.*;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;
import com.sun.jersey.client.apache4.ApacheHttpClient4;
import com.sun.jersey.oauth.client.OAuthClientFilter;
import com.sun.jersey.oauth.signature.HMAC_SHA1;
import com.sun.jersey.oauth.signature.OAuthParameters;
import com.sun.jersey.oauth.signature.OAuthRequest;
import com.sun.jersey.oauth.signature.OAuthSecrets;
import com.sun.jersey.oauth.signature.OAuthSignature;
import com.sun.jersey.oauth.signature.OAuthSignatureException;

import org.mule.modules.withings.exception.WithingsRestConnectorException;
import org.mule.modules.withings.exception.WithingsRestConnectorTokenExpiredException;
import org.mule.modules.withings.entities.bodymeasures.BodyMeasurementResponse;
import org.mule.modules.withings.entities.activitymeasures.ActivityMeasurementResponse;
import org.mule.modules.withings.entities.intradayactivity.IntradayActivityResponse;
import org.mule.modules.withings.entities.sleepmeasures.SleepMeasuresResponse;
import org.mule.modules.withings.entities.sleepsummary.SleepSummaryResponse;

public class WithingsClient {	
	private static final DateFormat withingsDateFormat = new SimpleDateFormat("yyyy-MM-dd");
	private Client client; /* a Jersey client instance */
    private WebResource apiResource; 
    private WithingsConnector connector;
     
    public WithingsClient(WithingsConnector connector) {
        setConnector(connector);
        ClientConfig clientConfig = new DefaultClientConfig();
        clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE); /* enable support for JSON to POJO entity mapping in Jersey */
        //this.client = Client.create(clientConfig);
        this.client = ApacheHttpClient4.create(clientConfig); //We need the ApacheHttpClient4 instead of Client because the latter cannot the rewrite HTTP header.
        this.apiResource = this.client.resource(getConnector().getApiUrl());
    }
    
	public BodyMeasurementResponse getBodyMeasures(Date startdate, Date endDate) throws WithingsRestConnectorException, WithingsRestConnectorTokenExpiredException {
		TreeMap<String, String> additionalParams = new TreeMap<String, String>();
		additionalParams.put("startdate", Long.toString(startdate.getTime() / 1000));		
		additionalParams.put("enddate", Long.toString(endDate.getTime() / 1000));
		WebResource webResource = createRequest(null, "measure", "getmeas", additionalParams);	
		try {
			return execute(webResource, BodyMeasurementResponse.class);
		} catch (InstantiationException | IllegalAccessException se) {
			return new BodyMeasurementResponse();
		}
	}
	
	public ActivityMeasurementResponse getActivityMeasures(Date startdate, Date endDate) throws WithingsRestConnectorException, WithingsRestConnectorTokenExpiredException {
		TreeMap<String, String> additionalParams = new TreeMap<String, String>();		
		additionalParams.put("startdateymd", withingsDateFormat.format(startdate));
		additionalParams.put("enddateymd", withingsDateFormat.format(endDate));
		WebResource webResource = createRequest("v2", "measure", "getactivity", additionalParams);
		try {
			return execute(webResource, ActivityMeasurementResponse.class);
		} catch (InstantiationException | IllegalAccessException se) {
			return new ActivityMeasurementResponse();
		}
	}
	
	public IntradayActivityResponse getIntradayActivity(String startdate, String endDate) throws WithingsRestConnectorException, WithingsRestConnectorTokenExpiredException {
		TreeMap<String, String> additionalParams = new TreeMap<String, String>();		
		additionalParams.put("startdate", startdate);		
		additionalParams.put("enddate", endDate);
		WebResource webResource = createRequest("v2", "measure", "getintradayactivity", additionalParams);
		try {
			return execute(webResource, IntradayActivityResponse.class);
		} catch (InstantiationException | IllegalAccessException se) {
			return new IntradayActivityResponse();
		}
	}
	
	public SleepMeasuresResponse getSleepMeasures(Date startdate, Date endDate) throws WithingsRestConnectorException, WithingsRestConnectorTokenExpiredException {
		TreeMap<String, String> additionalParams = new TreeMap<String, String>();		
		additionalParams.put("startdate", Long.toString(startdate.getTime() / 1000));		
		additionalParams.put("enddate", Long.toString(endDate.getTime() / 1000));
		WebResource webResource = createRequest("v2", "sleep", "get", additionalParams);
		try {
			return execute(webResource, SleepMeasuresResponse.class);
		} catch (InstantiationException | IllegalAccessException se) {
			return new SleepMeasuresResponse();
		}
	}
	
	public SleepSummaryResponse getSleepSummary(Date startdate, Date endDate) throws WithingsRestConnectorException, WithingsRestConnectorTokenExpiredException {
		TreeMap<String, String> additionalParams = new TreeMap<String, String>();		
		additionalParams.put("startdateymd", withingsDateFormat.format(startdate));
		additionalParams.put("enddateymd", withingsDateFormat.format(endDate));
		WebResource webResource = createRequest("v2", "sleep", "getsummary", additionalParams);
		try {
			return execute(webResource, SleepSummaryResponse.class);
		} catch (InstantiationException | IllegalAccessException se) {
			return new SleepSummaryResponse();
		}
	}

	private WebResource createRequest(String apiVersion, String resource, String action, TreeMap<String, String> additionalParams) {
		WebResource webResource = getApiResource();
		if (apiVersion != null) webResource = webResource.path(apiVersion);
		if (resource != null) webResource = webResource.path(resource);

		OAuthParameters oAuthParams = new OAuthParameters();
		oAuthParams.setSignatureMethod(HMAC_SHA1.NAME);
		oAuthParams.setConsumerKey(getConnector().getConsumerKey());
		oAuthParams.setNonce();
		oAuthParams.setToken(getConnector().getAccessToken());
		oAuthParams.setVersion();
		oAuthParams.setTimestamp();
		
        OAuthSecrets secrets = new OAuthSecrets();
        secrets.setConsumerSecret(getConnector().getConsumerSecret());
        secrets.setTokenSecret(getConnector().getAccessTokenSecret());

        webResource.addFilter(new OAuthClientFilter(client.getProviders(), oAuthParams, secrets));
        webResource.addFilter(new JsonClientFilter()); // This filter changes the content type from text/plain (as returned by Withings) to application/json (as required for JSON-to-POJO mapping).

        if (additionalParams == null) additionalParams = new TreeMap<String, String>();
        additionalParams.put("action", action);
        additionalParams.put("oauth_consumer_key", oAuthParams.getConsumerKey());
        additionalParams.put("oauth_nonce", oAuthParams.getNonce());
        additionalParams.put("oauth_signature_method", oAuthParams.getSignatureMethod());
        additionalParams.put("oauth_timestamp", oAuthParams.getTimestamp());
        additionalParams.put("oauth_token", oAuthParams.getToken());
        additionalParams.put("oauth_version", oAuthParams.getVersion());
        additionalParams.put("userid", getConnector().getUserId());
        
        DummyRequest request = new DummyRequest().requestMethod("GET").requestURL(webResource.getURI().toString());
        		
        for (Map.Entry<String, String> entry : additionalParams.entrySet()) {
        		request.parameterValue(entry.getKey(), entry.getValue());
	    }

        try {
        	additionalParams.put("oauth_signature", OAuthSignature.generate(request, oAuthParams, secrets));
        }
        catch (OAuthSignatureException se) {}

        for (Map.Entry<String, String> entry : additionalParams.entrySet()) {
        	webResource = webResource.queryParam(entry.getKey(), entry.getValue());
        }

        return webResource;        
	}

    private <T> T execute(WebResource webResource, Class<T> returnClass) throws WithingsRestConnectorTokenExpiredException,
    WithingsRestConnectorException, InstantiationException, IllegalAccessException {
    	this.getConnector().getLogger().info("+++" + webResource.getURI().toString());
    	
        try {
        	ClientResponse clientResponse = webResource.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
        	return clientResponse.getEntity(returnClass);         	
        } catch (Exception se) {
        	this.getConnector().getLogger().info(">>> Failed to convert JSON to POJO!!! (Exception: " + se.toString() + ")" ); 
        	return returnClass.newInstance(); 
        }
        /*
        if(clientResponse.getStatus() == 200) {
            return clientResponse.getEntity(returnClass);
        } else if (clientResponse.getStatus() == 401) {
            throw new WithingsRestConnectorTokenExpiredException("The access token has expired; " +
                    clientResponse.getEntity(String.class));
        } else {
            throw new WithingsRestConnectorException(
                    String.format("ERROR - statusCode: %d - message: %s",
                            clientResponse.getStatus(), clientResponse.getEntity(String.class)));
        }
        */
    }
 
 
    public Client getClient() {
        return client;
    }
 
    public void setClient(Client client) {
        this.client = client;
    }
 
    public WebResource getApiResource() {
        return apiResource;
    }
 
    public void setApiResource(WebResource apiResource) {
        this.apiResource = apiResource;
    }
 
    public WithingsConnector getConnector() {
        return connector;
    }
 
    public void setConnector(WithingsConnector connector) {
        this.connector = connector;
    }
}
