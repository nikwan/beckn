
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
    "id",
    "driver",
    "travellers",
    "fare"
})
public class Trip {

    @JsonProperty("id")
    private String id;
    @JsonProperty("driver")
    private Driver driver;
    @JsonProperty("travellers")
    private List<Traveller> travellers = null;
    @JsonProperty("fare")
    private Fare fare;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Trip withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("driver")
    public Driver getDriver() {
        return driver;
    }

    @JsonProperty("driver")
    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Trip withDriver(Driver driver) {
        this.driver = driver;
        return this;
    }

    @JsonProperty("travellers")
    public List<Traveller> getTravellers() {
        return travellers;
    }

    @JsonProperty("travellers")
    public void setTravellers(List<Traveller> travellers) {
        this.travellers = travellers;
    }

    public Trip withTravellers(List<Traveller> travellers) {
        this.travellers = travellers;
        return this;
    }

    @JsonProperty("fare")
    public Fare getFare() {
        return fare;
    }

    @JsonProperty("fare")
    public void setFare(Fare fare) {
        this.fare = fare;
    }

    public Trip withFare(Fare fare) {
        this.fare = fare;
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

    public Trip withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
