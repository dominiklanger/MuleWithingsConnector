// Created using http://www.jsonschema2pojo.org/

package org.mule.modules.withings.entities.activitymeasures;

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
	"date",
	"steps",
	"distance",
	"calories",
	"elevation",
	"soft",
	"moderate",
	"intense",
	"timezone"
})
public class Activity {
	
	@JsonProperty("date")
	private String date;
	@JsonProperty("steps")
	private Integer steps;
	@JsonProperty("distance")
	private Double distance;
	@JsonProperty("calories")
	private Double calories;
	@JsonProperty("elevation")
	private Double elevation;
	@JsonProperty("soft")
	private Integer soft;
	@JsonProperty("moderate")
	private Integer moderate;
	@JsonProperty("intense")
	private Integer intense;
	@JsonProperty("timezone")
	private String timezone;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	
	/**
	*
	* @return
	* The date
	*/
	@JsonProperty("date")
	public String getDate() {
		return date;
	}
	
	/**
	*
	* @param date
	* The date
	*/
	@JsonProperty("date")
	public void setDate(String date) {
		this.date = date;
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
	* The soft
	*/
	@JsonProperty("soft")
	public Integer getSoft() {
		return soft;
	}
	
	/**
	*
	* @param soft
	* The soft
	*/
	@JsonProperty("soft")
	public void setSoft(Integer soft) {
		this.soft = soft;
	}
	
	/**
	*
	* @return
	* The moderate
	*/
	@JsonProperty("moderate")
	public Integer getModerate() {
		return moderate;
	}
	
	/**
	*
	* @param moderate
	* The moderate
	*/
	@JsonProperty("moderate")
	public void setModerate(Integer moderate) {
		this.moderate = moderate;
	}
	
	/**
	*
	* @return
	* The intense
	*/
	@JsonProperty("intense")
	public Integer getIntense() {
		return intense;
	}
	
	/**
	*
	* @param intense
	* The intense
	*/
	@JsonProperty("intense")
	public void setIntense(Integer intense) {
		this.intense = intense;
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
	
	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}
	
	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}