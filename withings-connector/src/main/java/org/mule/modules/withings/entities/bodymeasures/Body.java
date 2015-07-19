// Created using http://www.jsonschema2pojo.org/

package org.mule.modules.withings.entities.bodymeasures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
	"updatetime",
	"measuregrps",
	"timezone"
})
public class Body {
	
	@JsonProperty("updatetime")
	private Integer updatetime;
	@JsonProperty("timezone")
	private String timezone;
	@JsonProperty("measuregrps")
	private List<MeasureGroup> measuregrps = new ArrayList<MeasureGroup>();
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	
	/**
	*
	* @return
	* The updatetime
	*/
	@JsonProperty("updatetime")
	public Integer getUpdatetime() {
		return updatetime;
	}
	
	/**
	*
	* @param updatetime
	* The updatetime
	*/
	@JsonProperty("updatetime")
	public void setUpdatetime(Integer updatetime) {
		this.updatetime = updatetime;
	}
	
	/**
	*
	* @return
	* The timezone
	*/
	@JsonProperty("timezone")
	public String getTimezone() {
		return timezone;
	}
	
	/**
	*
	* @param timezone
	* The timezone
	*/
	@JsonProperty("timezone")
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	
	/**
	*
	* @return
	* The measuregrps
	*/
	@JsonProperty("measuregrps")
	public List<MeasureGroup> getMeasuregrps() {
		return measuregrps;
	}
	
	/**
	*
	* @param measuregrps
	* The measuregrps
	*/
	@JsonProperty("measuregrps")
	public void setMeasuregrps(List<MeasureGroup> measuregrps) {
		this.measuregrps = measuregrps;
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