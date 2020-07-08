
package io.swagger.model.mobility.select;

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
    "fare_product",
    "fare_media",
    "travellers",
    "stops"
})
public class Trip {

    @JsonProperty("fare_product")
    private FareProduct fareProduct;
    @JsonProperty("fare_media")
    private FareMedia fareMedia;
    @JsonProperty("travellers")
    private List<Traveller> travellers = null;
    @JsonProperty("stops")
    private List<Stop> stops = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("fare_product")
    public FareProduct getFareProduct() {
        return fareProduct;
    }

    @JsonProperty("fare_product")
    public void setFareProduct(FareProduct fareProduct) {
        this.fareProduct = fareProduct;
    }

    @JsonProperty("fare_media")
    public FareMedia getFareMedia() {
        return fareMedia;
    }

    @JsonProperty("fare_media")
    public void setFareMedia(FareMedia fareMedia) {
        this.fareMedia = fareMedia;
    }

    @JsonProperty("travellers")
    public List<Traveller> getTravellers() {
        return travellers;
    }

    @JsonProperty("travellers")
    public void setTravellers(List<Traveller> travellers) {
        this.travellers = travellers;
    }

    @JsonProperty("stops")
    public List<Stop> getStops() {
        return stops;
    }

    @JsonProperty("stops")
    public void setStops(List<Stop> stops) {
        this.stops = stops;
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
