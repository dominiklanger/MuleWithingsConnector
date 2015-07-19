// Created using http://www.jsonschema2pojo.org/

package org.mule.modules.withings.entities.activitymeasures;

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
	"activities"
})
public class Body {
	
	@JsonProperty("activities")
	private List<Activity> activities = new ArrayList<Activity>();
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	
	/**
	*
	* @return
	* The activities
	*/
	@JsonProperty("activities")
	public List<Activity> getActivities() {
		return activities;
	}
	
	/**
	*
	* @param activities
	* The activities
	*/
	@JsonProperty("activities")
	public void setActivities(List<Activity> activities) {
		this.activities = activities;
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