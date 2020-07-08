
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
    "email",
    "mobile",
    "landline"
})
public class Contact {

    @JsonProperty("email")
    private String email;
    @JsonProperty("mobile")
    private Mobile mobile;
    @JsonProperty("landline")
    private Landline landline;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    public Contact withEmail(String email) {
        this.email = email;
        return this;
    }

    @JsonProperty("mobile")
    public Mobile getMobile() {
        return mobile;
    }

    @JsonProperty("mobile")
    public void setMobile(Mobile mobile) {
        this.mobile = mobile;
    }

    public Contact withMobile(Mobile mobile) {
        this.mobile = mobile;
        return this;
    }

    @JsonProperty("landline")
    public Landline getLandline() {
        return landline;
    }

    @JsonProperty("landline")
    public void setLandline(Landline landline) {
        this.landline = landline;
    }

    public Contact withLandline(Landline landline) {
        this.landline = landline;
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

    public Contact withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
