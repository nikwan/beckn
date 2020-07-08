
package io.swagger.model.mobility.select;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.model.Descriptor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "descriptor",
    "location",
    "arrival_time",
    "departure_time"
})
public class Stop {

    @JsonProperty("descriptor")
    private Descriptor descriptor;
    @JsonProperty("location")
    private Location location;
    @JsonProperty("arrival_time")
    private ArrivalTime arrivalTime;
    @JsonProperty("departure_time")
    private DepartureTime departureTime;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("descriptor")
    public Descriptor getDescriptor() {
        return descriptor;
    }

    @JsonProperty("descriptor")
    public void setDescriptor(Descriptor descriptor) {
        this.descriptor = descriptor;
    }

    @JsonProperty("location")
    public Location getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(Location location) {
        this.location = location;
    }

    @JsonProperty("arrival_time")
    public ArrivalTime getArrivalTime() {
        return arrivalTime;
    }

    @JsonProperty("arrival_time")
    public void setArrivalTime(ArrivalTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    @JsonProperty("departure_time")
    public DepartureTime getDepartureTime() {
        return departureTime;
    }

    @JsonProperty("departure_time")
    public void setDepartureTime(DepartureTime departureTime) {
        this.departureTime = departureTime;
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
