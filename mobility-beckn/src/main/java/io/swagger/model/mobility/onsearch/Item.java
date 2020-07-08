
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
    "parent_item_id",
    "descriptor",
    "price",
    "model_id",
    "category_id",
    "brand_id",
    "promotional",
    "ttl",
    "tags"
})
public class Item {

    @JsonProperty("id")
    private String id;
    @JsonProperty("parent_item_id")
    private String parentItemId;
    @JsonProperty("descriptor")
    private Descriptor descriptor;
    @JsonProperty("price")
    private Price price;
    @JsonProperty("model_id")
    private String modelId;
    @JsonProperty("category_id")
    private String categoryId;
    @JsonProperty("brand_id")
    private String brandId;
    @JsonProperty("promotional")
    private Boolean promotional;
    @JsonProperty("ttl")
    private String ttl;
    @JsonProperty("tags")
    private List<Tag> tags = null;
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

    @JsonProperty("parent_item_id")
    public String getParentItemId() {
        return parentItemId;
    }

    @JsonProperty("parent_item_id")
    public void setParentItemId(String parentItemId) {
        this.parentItemId = parentItemId;
    }

    @JsonProperty("descriptor")
    public Descriptor getDescriptor() {
        return descriptor;
    }

    @JsonProperty("descriptor")
    public void setDescriptor(Descriptor descriptor) {
        this.descriptor = descriptor;
    }

    @JsonProperty("price")
    public Price getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(Price price) {
        this.price = price;
    }

    @JsonProperty("model_id")
    public String getModelId() {
        return modelId;
    }

    @JsonProperty("model_id")
    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    @JsonProperty("category_id")
    public String getCategoryId() {
        return categoryId;
    }

    @JsonProperty("category_id")
    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    @JsonProperty("brand_id")
    public String getBrandId() {
        return brandId;
    }

    @JsonProperty("brand_id")
    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    @JsonProperty("promotional")
    public Boolean getPromotional() {
        return promotional;
    }

    @JsonProperty("promotional")
    public void setPromotional(Boolean promotional) {
        this.promotional = promotional;
    }

    @JsonProperty("ttl")
    public String getTtl() {
        return ttl;
    }

    @JsonProperty("ttl")
    public void setTtl(String ttl) {
        this.ttl = ttl;
    }

    @JsonProperty("tags")
    public List<Tag> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(List<Tag> tags) {
        this.tags = tags;
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
