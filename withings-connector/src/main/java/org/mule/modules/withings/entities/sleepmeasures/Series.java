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
	"startdate",
	"state",
	"enddate"
})
public class Series {
	
	@JsonProperty("startdate")
	private Integer startdate;
	@JsonProperty("state")
	private Integer state;
	@JsonProperty("enddate")
	private Integer enddate;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	
	/**
	*
	* @return
	* The startdate
	*/
	@JsonProperty("startdate")
	public Integer getStartdate() {
		return startdate;
	}
	
	/**
	*
	* @param startdate
	* The startdate
	*/
	@JsonProperty("startdate")
	public void setStartdate(Integer startdate) {
		this.startdate = startdate;
	}
	
	/**
	*
	* @return
	* The state
	*/
	@JsonProperty("state")
	public Integer getState() {
		return state;
	}
	
	/**
	*
	* @param state
	* The state
	*/
	@JsonProperty("state")
	public void setState(Integer state) {
		this.state = state;
	}
	
	/**
	*
	* @return
	* The enddate
	*/
	@JsonProperty("enddate")
	public Integer getEnddate() {
		return enddate;
	}
	
	/**
	*
	* @param enddate
	* The enddate
	*/
	@JsonProperty("enddate")
	public void setEnddate(Integer enddate) {
		this.enddate = enddate;
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