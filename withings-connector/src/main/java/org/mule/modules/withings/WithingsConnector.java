/**
 * (c) 2003-2015 MuleSoft, Inc. The software in this package is published under the terms of the CPAL v1.0 license,
 * a copy of which has been included with this distribution in the LICENSE.md file.
 */

package org.mule.modules.withings;

import java.util.*;
import java.text.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.mule.api.MuleEvent;
import org.mule.api.annotations.lifecycle.Start;
import org.mule.api.annotations.oauth.OAuth;
import org.mule.api.annotations.oauth.OAuthAccessToken;
import org.mule.api.annotations.oauth.OAuthAccessTokenSecret;
import org.mule.api.annotations.oauth.OAuthConsumerKey;
import org.mule.api.annotations.oauth.OAuthConsumerSecret;
import org.mule.api.annotations.oauth.OAuthProtected;
import org.mule.api.annotations.oauth.OAuthSigningStrategy;
import org.mule.api.annotations.Connector;
import org.mule.api.annotations.Configurable;
import org.mule.api.annotations.param.Default;
import org.mule.api.annotations.Processor;
import org.mule.modules.withings.exception.WithingsRestConnectorException;
import org.mule.modules.withings.exception.WithingsRestConnectorTokenExpiredException;
import org.mule.modules.withings.entities.WithingsOAuthParams;


import org.mule.modules.withings.entities.bodymeasures.BodyMeasurementResponse;
import org.mule.modules.withings.entities.activitymeasures.ActivityMeasurementResponse;
import org.mule.modules.withings.entities.intradayactivity.IntradayActivityResponse;
import org.mule.modules.withings.entities.sleepmeasures.SleepMeasuresResponse;
import org.mule.modules.withings.entities.sleepsummary.SleepSummaryResponse;

@Connector(name="withings", schemaVersion = "1.0", friendlyName="Withings")
@OAuth(
		signingStrategy = OAuthSigningStrategy.QUERY_STRING,
		requestTokenUrl = "https://oauth.withings.com/account/request_token", 
		accessTokenUrl = "https://oauth.withings.com/account/access_token", 
		authorizationUrl = "https://oauth.withings.com/account/authorize")
public class WithingsConnector {
	private static final Logger logger = LogManager.getLogger("WithingsConnector");
    private static final DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    
	
    @Configurable
    @Default("http://wbsapi.withings.net")
    private String apiUrl;
 
    @Configurable 
    @OAuthConsumerKey
    private String consumerKey;

    @Configurable 
    @OAuthConsumerSecret
    private String consumerSecret;
 
    @OAuthAccessToken
    private String accessToken;
     
    @OAuthAccessTokenSecret
    private String accessTokenSecret;
    
    private WithingsClient client;
    private String customAttribute;
    private String userId;

    
    @Start
    public void init() {
        this.client = new WithingsClient(this);
    }
    
    @Processor
    public void setCustomAttribute(String customAttribute) {
    	this.customAttribute = customAttribute;
    }
    
	@Processor
	public BodyMeasurementResponse getBodyMeasures(String startdate, String endDate) throws ParseException, WithingsRestConnectorException, WithingsRestConnectorTokenExpiredException {
		return client.getBodyMeasures(dateFormat.parse(startdate), dateFormat.parse(endDate));
	}
	
	@Processor
	public ActivityMeasurementResponse getActivityMeasures(String startdate, String endDate) throws ParseException, WithingsRestConnectorException, WithingsRestConnectorTokenExpiredException {
		return client.getActivityMeasures(dateFormat.parse(startdate), dateFormat.parse(endDate));
	}
	
	@Processor
	public IntradayActivityResponse getIntradayActivity(String startdate, String endDate) throws ParseException, WithingsRestConnectorException, WithingsRestConnectorTokenExpiredException {
		return client.getIntradayActivity(startdate, endDate);
	}
	
	@Processor
	public SleepMeasuresResponse getSleepMeasures(String startdate, String endDate) throws ParseException, WithingsRestConnectorException, WithingsRestConnectorTokenExpiredException {
		return client.getSleepMeasures(dateFormat.parse(startdate), dateFormat.parse(endDate));
	}

	@Processor
	public SleepSummaryResponse getSleepSummary(String startdate, String endDate) throws ParseException, WithingsRestConnectorException, WithingsRestConnectorTokenExpiredException {
		return client.getSleepSummary(dateFormat.parse(startdate), dateFormat.parse(endDate));
	}
	
	@Processor
	public WithingsOAuthParams getUser() { 
		WithingsOAuthParams user = new WithingsOAuthParams(
				getUserId(),
				getAccessToken(),
				getAccessTokenSecret()
				);		
		user.setCustomAttribute(this.customAttribute);
		return user;
	}
	
	@Processor
	public void setUser(WithingsOAuthParams userParams) { 
		if (userParams.getUserId() != null) this.setUserId(userParams.getUserId());
		if (userParams.getAccessToken() != null) this.setAccessToken(userParams.getAccessToken());
		if (userParams.getAccessTokenSecret() != null) this.setAccessTokenSecret(userParams.getAccessTokenSecret());
		if (userParams.getCustomAttribute() != null) this.setCustomAttribute(userParams.getCustomAttribute());
	}
	
    public String getConsumerKey() {
		return consumerKey;
	}

	public void setConsumerKey(String consumerKey) {
		this.consumerKey = consumerKey;
	}

	public String getConsumerSecret() {
		return consumerSecret;
	}

	public void setConsumerSecret(String consumerSecret) {
		this.consumerSecret = consumerSecret;
	}

	public String getAccessToken() {
		logger.info("*** returning accessToken: " + this.accessToken);
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
		logger.info("*** accessToken set to " + this.accessToken);
	}

	public String getAccessTokenSecret() {
		logger.info("*** returning accessTokenSecret: " + this.accessTokenSecret);
		return accessTokenSecret;
	}

	public void setAccessTokenSecret(String accessTokenSecret) {
		this.accessTokenSecret = accessTokenSecret;
		logger.info("*** accessTokenSecret set to " + this.accessTokenSecret);
	}
    
    public static Logger getLogger() {
        return logger;
    }

    public String getApiUrl() {
        return apiUrl;
    }

    public void setApiUrl(String apiUrl) {
        this.apiUrl = apiUrl;
    }
    
    public String getUserId() {
    	return userId;
    }
    
    public void setUserId(String userId) {
    	this.userId = userId;
    }
}