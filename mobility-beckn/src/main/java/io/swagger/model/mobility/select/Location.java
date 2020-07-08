
package io.swagger.model.mobility.select;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "gps",
    "address",
    "station_code",
    "area_code",
    "city",
    "country",
    "circle",
    "polygon",
    "3dspace"
})
public class Location {

    @JsonProperty("type")
    private String type;
    @JsonProperty("gps")
    private Gps gps;
    @JsonProperty("address")
    private Address address;
    @JsonProperty("station_code")
    private String stationCode;
    @JsonProperty("area_code")
    private String areaCode;
    @JsonProperty("city")
    private City city;
    @JsonProperty("country")
    private Country country;
    @JsonProperty("circle")
    private Circle circle;
    @JsonProperty("polygon")
    private String polygon;
    @JsonProperty("3dspace")
    private String _3dspace;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("gps")
    public Gps getGps() {
        return gps;
    }

    @JsonProperty("gps")
    public void setGps(Gps gps) {
        this.gps = gps;
    }

    @JsonProperty("address")
    public Address getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(Address address) {
        this.address = address;
    }

    @JsonProperty("station_code")
    public String getStationCode() {
        return stationCode;
    }

    @JsonProperty("station_code")
    public void setStationCode(String stationCode) {
        this.stationCode = stationCode;
    }

    @JsonProperty("area_code")
    public String getAreaCode() {
        return areaCode;
    }

    @JsonProperty("area_code")
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    @JsonProperty("city")
    public City getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(City city) {
        this.city = city;
    }

    @JsonProperty("country")
    public Country getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(Country country) {
        this.country = country;
    }

    @JsonProperty("circle")
    public Circle getCircle() {
        return circle;
    }

    @JsonProperty("circle")
    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    @JsonProperty("polygon")
    public String getPolygon() {
        return polygon;
    }

    @JsonProperty("polygon")
    public void setPolygon(String polygon) {
        this.polygon = polygon;
    }

    @JsonProperty("3dspace")
    public String get3dspace() {
        return _3dspace;
    }

    @JsonProperty("3dspace")
    public void set3dspace(String _3dspace) {
        this._3dspace = _3dspace;
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
