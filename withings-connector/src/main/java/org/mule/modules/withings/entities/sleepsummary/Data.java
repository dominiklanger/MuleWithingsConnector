package org.mule.modules.withings.entities.sleepsummary;

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
	"wakeupduration",
	"lightsleepduration",
	"deepsleepduration",
	"remsleepduration",
	"durationtosleep",
	"durationtowakeup",
	"wakeupcount"
})
public class Data {
	
	@JsonProperty("wakeupduration")
	private Integer wakeupduration;
	@JsonProperty("lightsleepduration")
	private Integer lightsleepduration;
	@JsonProperty("deepsleepduration")
	private Integer deepsleepduration;
	@JsonProperty("remsleepduration")
	private Integer remsleepduration;
	@JsonProperty("durationtosleep")
	private Integer durationtosleep;
	@JsonProperty("durationtowakeup")
	private Integer durationtowakeup;
	@JsonProperty("wakeupcount")
	private Integer wakeupcount;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	
	/**
	*
	* @return
	* The wakeupduration
	*/
	@JsonProperty("wakeupduration")
	public Integer getWakeupduration() {
		return wakeupduration;
	}
	
	/**
	*
	* @param wakeupduration
	* The wakeupduration
	*/
	@JsonProperty("wakeupduration")
	public void setWakeupduration(Integer wakeupduration) {
		this.wakeupduration = wakeupduration;
	}
	
	/**
	*
	* @return
	* The lightsleepduration
	*/
	@JsonProperty("lightsleepduration")
	public Integer getLightsleepduration() {
		return lightsleepduration;
	}
	
	/**
	*
	* @param lightsleepduration
	* The lightsleepduration
	*/
	@JsonProperty("lightsleepduration")
	public void setLightsleepduration(Integer lightsleepduration) {
		this.lightsleepduration = lightsleepduration;
	}
	
	/**
	*
	* @return
	* The deepsleepduration
	*/
	@JsonProperty("deepsleepduration")
	public Integer getDeepsleepduration() {
		return deepsleepduration;
	}
	
	/**
	*
	* @param deepsleepduration
	* The deepsleepduration
	*/
	@JsonProperty("deepsleepduration")
	public void setDeepsleepduration(Integer deepsleepduration) {
		this.deepsleepduration = deepsleepduration;
	}
	
	/**
	*
	* @return
	* The remsleepduration
	*/
	@JsonProperty("remsleepduration")
	public Integer getRemsleepduration() {
		return remsleepduration;
	}
	
	/**
	*
	* @param remsleepduration
	* The remsleepduration
	*/
	@JsonProperty("remsleepduration")
	public void setRemsleepduration(Integer remsleepduration) {
		this.remsleepduration = remsleepduration;
	}
	
	/**
	*
	* @return
	* The durationtosleep
	*/
	@JsonProperty("durationtosleep")
	public Integer getDurationtosleep() {
		return durationtosleep;
	}
	
	/**
	*
	* @param durationtosleep
	* The durationtosleep
	*/
	@JsonProperty("durationtosleep")
	public void setDurationtosleep(Integer durationtosleep) {
		this.durationtosleep = durationtosleep;
	}
	
	/**
	*
	* @return
	* The durationtowakeup
	*/
	@JsonProperty("durationtowakeup")
	public Integer getDurationtowakeup() {
		return durationtowakeup;
	}
	
	/**
	*
	* @param durationtowakeup
	* The durationtowakeup
	*/
	@JsonProperty("durationtowakeup")
	public void setDurationtowakeup(Integer durationtowakeup) {
		this.durationtowakeup = durationtowakeup;
	}
	
	/**
	*
	* @return
	* The wakeupcount
	*/
	@JsonProperty("wakeupcount")
	public Integer getWakeupcount() {
		return wakeupcount;
	}
	
	/**
	*
	* @param wakeupcount
	* The wakeupcount
	*/
	@JsonProperty("wakeupcount")
	public void setWakeupcount(Integer wakeupcount) {
		this.wakeupcount = wakeupcount;
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