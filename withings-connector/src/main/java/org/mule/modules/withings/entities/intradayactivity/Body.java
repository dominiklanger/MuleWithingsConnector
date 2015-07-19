package org.mule.modules.withings.entities.intradayactivity;

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
	"series"
})
public class Body {
	@JsonProperty("series")
	private Map<String, Record> series = new HashMap<String, Record>();
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	*
	* @return
	* The series
	*/
	@JsonProperty("series")
	public Map<String, Record> getSeries() {
		return this.series;
	}
	
	/**
	*
	* @param series
	* The series
	*/
	@JsonProperty("series")
	public void setSeries(Map<String, Record> series) {
		this.series = series;
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