
package io.swagger.model.mobility.onselect;

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
    "integral",
    "fractional"
})
public class Amount {

    @JsonProperty("integral")
    private String integral;
    @JsonProperty("fractional")
    private String fractional;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("integral")
    public String getIntegral() {
        return integral;
    }

    @JsonProperty("integral")
    public void setIntegral(String integral) {
        this.integral = integral;
    }

    public Amount withIntegral(String integral) {
        this.integral = integral;
        return this;
    }

    @JsonProperty("fractional")
    public String getFractional() {
        return fractional;
    }

    @JsonProperty("fractional")
    public void setFractional(String fractional) {
        this.fractional = fractional;
    }

    public Amount withFractional(String fractional) {
        this.fractional = fractional;
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

    public Amount withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
