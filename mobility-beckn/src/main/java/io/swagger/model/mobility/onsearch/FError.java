
package io.swagger.model.mobility.onsearch;

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
    "fpath",
    "fcode",
    "fmessage"
})
public class FError {

    @JsonProperty("fpath")
    private String fpath;
    @JsonProperty("fcode")
    private String fcode;
    @JsonProperty("fmessage")
    private String fmessage;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("fpath")
    public String getFpath() {
        return fpath;
    }

    @JsonProperty("fpath")
    public void setFpath(String fpath) {
        this.fpath = fpath;
    }

    @JsonProperty("fcode")
    public String getFcode() {
        return fcode;
    }

    @JsonProperty("fcode")
    public void setFcode(String fcode) {
        this.fcode = fcode;
    }

    @JsonProperty("fmessage")
    public String getFmessage() {
        return fmessage;
    }

    @JsonProperty("fmessage")
    public void setFmessage(String fmessage) {
        this.fmessage = fmessage;
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
