
package io.swagger.model.mobility.onsearch;

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
    "t_error",
    "r_error",
    "f_error",
    "d_error"
})
public class Error {

    @JsonProperty("t_error")
    private TError tError;
    @JsonProperty("r_error")
    private RError rError;
    @JsonProperty("f_error")
    private List<FError> fError = null;
    @JsonProperty("d_error")
    private DError dError;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("t_error")
    public TError getTError() {
        return tError;
    }

    @JsonProperty("t_error")
    public void setTError(TError tError) {
        this.tError = tError;
    }

    @JsonProperty("r_error")
    public RError getRError() {
        return rError;
    }

    @JsonProperty("r_error")
    public void setRError(RError rError) {
        this.rError = rError;
    }

    @JsonProperty("f_error")
    public List<FError> getFError() {
        return fError;
    }

    @JsonProperty("f_error")
    public void setFError(List<FError> fError) {
        this.fError = fError;
    }

    @JsonProperty("d_error")
    public DError getDError() {
        return dError;
    }

    @JsonProperty("d_error")
    public void setDError(DError dError) {
        this.dError = dError;
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
