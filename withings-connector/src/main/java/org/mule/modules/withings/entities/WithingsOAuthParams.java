package org.mule.modules.withings.entities;

import javax.annotation.Generated;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
	"user_id", 
	"access_token", 
	"acess_token_secret", 
	"custom_attribute"
})
public class WithingsOAuthParams {
	@JsonProperty("user_id")
	private String userId;
	@JsonProperty("access_token")
	private String accessToken;
	@JsonProperty("acess_token_secret")
	private String acessTokenSecret;
	@JsonProperty("custom_attribute")
	private String customAttribute;
	
	public WithingsOAuthParams() {}
	
	public WithingsOAuthParams(String userId, String accessToken, String acessTokenSecret) {
		this.userId = userId;
		this.accessToken = accessToken;
		this.acessTokenSecret = acessTokenSecret;
	}

	@JsonProperty("user_id")
	public String getUserId() {
		return userId;
	}

	@JsonProperty("user_id")
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	@JsonProperty("access_token")
	public String getAccessToken() {
		return accessToken;
	}

	@JsonProperty("access_token")
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	@JsonProperty("acess_token_secret")
	public String getAccessTokenSecret() {
		return acessTokenSecret;
	}

	@JsonProperty("acess_token_secret")
	public void setAccessTokenSecret(String acessTokenSecret) {
		this.acessTokenSecret = acessTokenSecret;
	}
	
	@JsonProperty("custom_attribute")
	public String getCustomAttribute() {
		return customAttribute;
	}

	@JsonProperty("custom_attribute")
	public void setCustomAttribute(String customAttribute) {
		this.customAttribute = customAttribute;
	}
}
