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
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
	"value",
	"type",
	"unit"
})
public class Measure {

	@JsonProperty("value")
	private Integer value;
	@JsonProperty("type")
	private Integer type;
	@JsonProperty("unit")
	private Integer unit;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	
	/**
	*
	* @return
	* The value
	*/
	@JsonProperty("value")
	public Integer getValue() {
		return value;
	}
	
	/**
	*
	* @param value
	* The value
	*/
	@JsonProperty("value")
	public void setValue(Integer value) {
		this.value = value;
	}
	
	/**
	*
	* @return
	* The type
	*/
	@JsonProperty("type")
	public Integer getType() {
		return type;
	}
	
	/**
	*
	* @param type
	* The type
	*/
	@JsonProperty("type")
	public void setType(Integer type) {
		this.type = type;
	}
	
	/**
	*
	* @return
	* The unit
	*/
	@JsonProperty("unit")
	public Integer getUnit() {
		return unit;
	}
	
	/**
	*
	* @param unit
	* The unit
	*/
	@JsonProperty("unit")
	public void setUnit(Integer unit) {
		this.unit = unit;
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