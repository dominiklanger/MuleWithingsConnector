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
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
	"grpid",
	"attrib",
	"date",
	"category",
	"measures"
})
public class MeasureGroup {
	@JsonProperty("grpid")
	private Integer grpid;
	@JsonProperty("attrib")
	private Integer attrib;
	@JsonProperty("date")
	private Integer date;
	@JsonProperty("category")
	private Integer category;
	@JsonProperty("measures")
	private List<Measure> measures = new ArrayList<Measure>();
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	
	/**
	*
	* @return
	* The grpid
	*/
	@JsonProperty("grpid")
	public Integer getGrpid() {
		return grpid;
	}
	
	/**
	*
	* @param grpid
	* The grpid
	*/
	@JsonProperty("grpid")
	public void setGrpid(Integer grpid) {
		this.grpid = grpid;
	}
	
	/**
	*
	* @return
	* The attrib
	*/
	@JsonProperty("attrib")
	public Integer getAttrib() {
		return attrib;
	}
	
	/**
	*
	* @param attrib
	* The attrib
	*/
	@JsonProperty("attrib")
	public void setAttrib(Integer attrib) {
		this.attrib = attrib;
	}
	
	/**
	*
	* @return
	* The date
	*/
	@JsonProperty("date")
	public Integer getDate() {
		return date;
	}
	
	/**
	*
	* @param date
	* The date
	*/
	@JsonProperty("date")
	public void setDate(Integer date) {
		this.date = date;
	}
	
	/**
	*
	* @return
	* The category
	*/
	@JsonProperty("category")
	public Integer getCategory() {
		return category;
	}
	
	/**
	*
	* @param category
	* The category
	*/
	@JsonProperty("category")
	public void setCategory(Integer category) {
		this.category = category;
	}
	
	/**
	*
	* @return
	* The measures
	*/
	@JsonProperty("measures")
	public List<Measure> getMeasures() {
		return measures;
	}
	
	/**
	*
	* @param measures
	* The measures
	*/
	@JsonProperty("measures")
	public void setMeasures(List<Measure> measures) {
		this.measures = measures;
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