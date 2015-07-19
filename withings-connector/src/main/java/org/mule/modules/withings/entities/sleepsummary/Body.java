package org.mule.modules.withings.entities.sleepsummary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
	"series",
	"more"
})
public class Body {
	
	@JsonProperty("series")
	private List<Series> series = new ArrayList<Series>();
	@JsonProperty("more")
	private Boolean more;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	
	/**
	*
	* @return
	* The series
	*/
	@JsonProperty("series")
	public List<Series> getSeries() {
		return series;
	}
	
	/**
	*
	* @param series
	* The series
	*/
	@JsonProperty("series")
	public void setSeries(List<Series> series) {
		this.series = series;
	}
	
	/**
	*
	* @return
	* The more
	*/
	@JsonProperty("more")
	public Boolean getMore() {
		return more;
	}
	
	/**
	*
	* @param more
	* The more
	*/
	@JsonProperty("more")
	public void setMore(Boolean more) {
		this.more = more;
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