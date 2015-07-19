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
	"calories",
	"duration",
	"steps",
	"elevation",
	"distance"
})
public class Record {
	
	@JsonProperty("calories")
	private Double calories;
	@JsonProperty("duration")
	private Integer duration;
	@JsonProperty("steps")
	private Integer steps;
	@JsonProperty("elevation")
	private Double elevation;
	@JsonProperty("distance")
	private Double distance;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	
	/**
	*
	* @return
	* The calories
	*/
	@JsonProperty("calories")
	public Double getCalories() {
		return calories;
	}
	
	/**
	*
	* @param calories
	* The calories
	*/
	@JsonProperty("calories")
	public void setCalories(Double calories) {
		this.calories = calories;
	}
	
	/**
	*
	* @return
	* The duration
	*/
	@JsonProperty("duration")
	public Integer getDuration() {
		return duration;
	}
	
	/**
	*
	* @param duration
	* The duration
	*/
	@JsonProperty("duration")
	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	
	/**
	*
	* @return
	* The steps
	*/
	@JsonProperty("steps")
	public Integer getSteps() {
		return steps;
	}
	
	/**
	*
	* @param steps
	* The steps
	*/
	@JsonProperty("steps")
	public void setSteps(Integer steps) {
		this.steps = steps;
	}
	
	/**
	*
	* @return
	* The elevation
	*/
	@JsonProperty("elevation")
	public Double getElevation() {
		return elevation;
	}
	
	/**
	*
	* @param elevation
	* The elevation
	*/
	@JsonProperty("elevation")
	public void setElevation(Double elevation) {
		this.elevation = elevation;
	}
	
	/**
	*
	* @return
	* The distance
	*/
	@JsonProperty("distance")
	public Double getDistance() {
		return distance;
	}
	
	/**
	*
	* @param distance
	* The distance
	*/
	@JsonProperty("distance")
	public void setDistance(Double distance) {
		this.distance = distance;
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