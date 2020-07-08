
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
    "est",
    "act"
})
public class DepartureTime {

    @JsonProperty("est")
    private String est;
    @JsonProperty("act")
    private String act;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("est")
    public String getEst() {
        return est;
    }

    @JsonProperty("est")
    public void setEst(String est) {
        this.est = est;
    }

    @JsonProperty("act")
    public String getAct() {
        return act;
    }

    @JsonProperty("act")
    public void setAct(String act) {
        this.act = act;
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
