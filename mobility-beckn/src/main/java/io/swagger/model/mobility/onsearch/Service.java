
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
    "id",
    "provider",
    "catalog",
    "policies"
})
public class Service {

    @JsonProperty("id")
    private String id;
    @JsonProperty("provider")
    private Provider provider;
    @JsonProperty("catalog")
    private Catalog catalog;
    @JsonProperty("policies")
    private List<Policy> policies = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("provider")
    public Provider getProvider() {
        return provider;
    }

    @JsonProperty("provider")
    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    @JsonProperty("catalog")
    public Catalog getCatalog() {
        return catalog;
    }

    @JsonProperty("catalog")
    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
    }

    @JsonProperty("policies")
    public List<Policy> getPolicies() {
        return policies;
    }

    @JsonProperty("policies")
    public void setPolicies(List<Policy> policies) {
        this.policies = policies;
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
