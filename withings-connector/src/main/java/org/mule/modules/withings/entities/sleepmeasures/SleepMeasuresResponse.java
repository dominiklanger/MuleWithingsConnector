package org.mule.modules.withings.entities.sleepmeasures;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
	"status",
	"body"
})
public class SleepMeasuresResponse {
	
	@JsonProperty("status")
	private Integer status;
	@JsonProperty("body")
	private Body body = new Body();
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	
	/**
	*
	* @return
	* The status
	*/
	@JsonProperty("status")
	public Integer getStatus() {
		return status;
	}
	
	/**
	*
	* @param status
	* The status
	*/
	@JsonProperty("status")
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	/**
	*
	* @return
	* The body
	*/
	@JsonProperty("body")
	public Body getBody() {
		return body;
	}
	
	/**
	*
	* @param body
	* The body
	*/
	@JsonProperty("body")
	public void setBody(Body body) {
		this.body = body;
	}
	
	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}
	
	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}