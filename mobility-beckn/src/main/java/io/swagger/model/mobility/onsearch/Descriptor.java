
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
    "name",
    "code",
    "sym",
    "short_desc",
    "long_desc",
    "images",
    "audio",
    "3d_render"
})
public class Descriptor {

    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("code")
    private String code;
    @JsonProperty("sym")
    private String sym;
    @JsonProperty("short_desc")
    private String shortDesc;
    @JsonProperty("long_desc")
    private String longDesc;
    @JsonProperty("images")
    private List<Image> images = null;
    @JsonProperty("audio")
    private String audio;
    @JsonProperty("3d_render")
    private String _3dRender;
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

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("sym")
    public String getSym() {
        return sym;
    }

    @JsonProperty("sym")
    public void setSym(String sym) {
        this.sym = sym;
    }

    @JsonProperty("short_desc")
    public String getShortDesc() {
        return shortDesc;
    }

    @JsonProperty("short_desc")
    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
    }

    @JsonProperty("long_desc")
    public String getLongDesc() {
        return longDesc;
    }

    @JsonProperty("long_desc")
    public void setLongDesc(String longDesc) {
        this.longDesc = longDesc;
    }

    @JsonProperty("images")
    public List<Image> getImages() {
        return images;
    }

    @JsonProperty("images")
    public void setImages(List<Image> images) {
        this.images = images;
    }

    @JsonProperty("audio")
    public String getAudio() {
        return audio;
    }

    @JsonProperty("audio")
    public void setAudio(String audio) {
        this.audio = audio;
    }

    @JsonProperty("3d_render")
    public String get3dRender() {
        return _3dRender;
    }

    @JsonProperty("3d_render")
    public void set3dRender(String _3dRender) {
        this._3dRender = _3dRender;
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
