
package io.swagger.model.mobility.onselect;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "currency",
    "estimated_value",
    "computed_value",
    "listed_value",
    "offered_value",
    "breakup"
})
public class Fare {

    @JsonProperty("currency")
    private String currency;
    @JsonProperty("estimated_value")
    private EstimatedValue estimatedValue;
    @JsonProperty("computed_value")
    private ComputedValue computedValue;
    @JsonProperty("listed_value")
    private ListedValue listedValue;
    @JsonProperty("offered_value")
    private OfferedValue offeredValue;
    @JsonProperty("breakup")
    private List<Breakup> breakup = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Fare withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    @JsonProperty("estimated_value")
    public EstimatedValue getEstimatedValue() {
        return estimatedValue;
    }

    @JsonProperty("estimated_value")
    public void setEstimatedValue(EstimatedValue estimatedValue) {
        this.estimatedValue = estimatedValue;
    }

    public Fare withEstimatedValue(EstimatedValue estimatedValue) {
        this.estimatedValue = estimatedValue;
        return this;
    }

    @JsonProperty("computed_value")
    public ComputedValue getComputedValue() {
        return computedValue;
    }

    @JsonProperty("computed_value")
    public void setComputedValue(ComputedValue computedValue) {
        this.computedValue = computedValue;
    }

    public Fare withComputedValue(ComputedValue computedValue) {
        this.computedValue = computedValue;
        return this;
    }

    @JsonProperty("listed_value")
    public ListedValue getListedValue() {
        return listedValue;
    }

    @JsonProperty("listed_value")
    public void setListedValue(ListedValue listedValue) {
        this.listedValue = listedValue;
    }

    public Fare withListedValue(ListedValue listedValue) {
        this.listedValue = listedValue;
        return this;
    }

    @JsonProperty("offered_value")
    public OfferedValue getOfferedValue() {
        return offeredValue;
    }

    @JsonProperty("offered_value")
    public void setOfferedValue(OfferedValue offeredValue) {
        this.offeredValue = offeredValue;
    }

    public Fare withOfferedValue(OfferedValue offeredValue) {
        this.offeredValue = offeredValue;
        return this;
    }

    @JsonProperty("breakup")
    public List<Breakup> getBreakup() {
        return breakup;
    }

    @JsonProperty("breakup")
    public void setBreakup(List<Breakup> breakup) {
        this.breakup = breakup;
    }

    public Fare withBreakup(List<Breakup> breakup) {
        this.breakup = breakup;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Fare withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
