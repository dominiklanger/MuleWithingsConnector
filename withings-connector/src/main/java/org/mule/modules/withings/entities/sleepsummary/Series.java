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
	"id",
	"timezone",
	"model",
	"startdate",
	"enddate",
	"date",
	"data",
	"modified"
})
public class Series {
	
	@JsonProperty("id")
	private Integer id;
	@JsonProperty("timezone")
	private String timezone;
	@JsonProperty("model")
	private Integer model;
	@JsonProperty("startdate")
	private Integer startdate;
	@JsonProperty("enddate")
	private Integer enddate;
	@JsonProperty("date")
	private String date;
	@JsonProperty("data")
	private Data data = new Data();
	@JsonProperty("modified")
	private Integer modified;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	
	/**
	*
	* @return
	* The id
	*/
	@JsonProperty("id")
	public Integer getId() {
		return id;
	}
	
	/**
	*
	* @param id
	* The id
	*/
	@JsonProperty("id")
	public void setId(Integer id) {
		this.id = id;
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
	* The model
	*/
	@JsonProperty("model")
	public Integer getModel() {
		return model;
	}
	
	/**
	*
	* @param model
	* The model
	*/
	@JsonProperty("model")
	public void setModel(Integer model) {
		this.model = model;
	}
	
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
	* The data
	*/
	@JsonProperty("data")
	public Data getData() {
		return data;
	}
	
	/**
	*
	* @param data
	* The data
	*/
	@JsonProperty("data")
	public void setData(Data data) {
		this.data = data;
	}
	
	/**
	*
	* @return
	* The modified
	*/
	@JsonProperty("modified")
	public Integer getModified() {
		return modified;
	}
	
	/**
	*
	* @param modified
	* The modified
	*/
	@JsonProperty("modified")
	public void setModified(Integer modified) {
		this.modified = modified;
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