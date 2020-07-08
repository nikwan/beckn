
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
    "rcode",
    "rmessage"
})
public class RError {

    @JsonProperty("rcode")
    private String rcode;
    @JsonProperty("rmessage")
    private String rmessage;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("rcode")
    public String getRcode() {
        return rcode;
    }

    @JsonProperty("rcode")
    public void setRcode(String rcode) {
        this.rcode = rcode;
    }

    public RError withRcode(String rcode) {
        this.rcode = rcode;
        return this;
    }

    @JsonProperty("rmessage")
    public String getRmessage() {
        return rmessage;
    }

    @JsonProperty("rmessage")
    public void setRmessage(String rmessage) {
        this.rmessage = rmessage;
    }

    public RError withRmessage(String rmessage) {
        this.rmessage = rmessage;
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

    public RError withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
