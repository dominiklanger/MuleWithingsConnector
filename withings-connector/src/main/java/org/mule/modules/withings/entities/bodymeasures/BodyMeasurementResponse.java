// Created using http://www.jsonschema2pojo.org/

package org.mule.modules.withings.entities.bodymeasures;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
	"status",
	"body"
})
public class BodyMeasurementResponse {
	
	@JsonProperty("status")
	private Integer status;
	@JsonProperty("body")
	private Body body = new Body();
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
	
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }
    @Override
    public boolean equals(Object other) {
        return EqualsBuilder.reflectionEquals(this, other);
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