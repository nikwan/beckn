
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
    "t_protocol",
    "t_version",
    "t_code"
})
public class TError {

    @JsonProperty("t_protocol")
    private String tProtocol;
    @JsonProperty("t_version")
    private String tVersion;
    @JsonProperty("t_code")
    private String tCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("t_protocol")
    public String getTProtocol() {
        return tProtocol;
    }

    @JsonProperty("t_protocol")
    public void setTProtocol(String tProtocol) {
        this.tProtocol = tProtocol;
    }

    @JsonProperty("t_version")
    public String getTVersion() {
        return tVersion;
    }

    @JsonProperty("t_version")
    public void setTVersion(String tVersion) {
        this.tVersion = tVersion;
    }

    @JsonProperty("t_code")
    public String getTCode() {
        return tCode;
    }

    @JsonProperty("t_code")
    public void setTCode(String tCode) {
        this.tCode = tCode;
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
