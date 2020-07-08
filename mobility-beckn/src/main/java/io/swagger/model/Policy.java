package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Describes a policy. Allows for domain extension.
 */
@ApiModel(description = "Describes a policy. Allows for domain extension.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-06-29T10:47:12.208Z[GMT]")
public class Policy   {
  @JsonProperty("id")
  private String id = null;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    CONFIRMATION_POLICY("CONFIRMATION_POLICY"),
    
    PAYMENT_POLICY("PAYMENT_POLICY"),
    
    CANCELLATION_POLICY("CANCELLATION_POLICY"),
    
    REFUND_POLICY("REFUND_POLICY");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("type")
  private TypeEnum type = null;

  @JsonProperty("parent_policy_id")
  private String parentPolicyId = null;

  @JsonProperty("heading")
  private String heading = null;

  @JsonProperty("terms")
  @Valid
  private List<Object> terms = null;

  public Policy id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Policy type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  
    public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Policy parentPolicyId(String parentPolicyId) {
    this.parentPolicyId = parentPolicyId;
    return this;
  }

  /**
   * Get parentPolicyId
   * @return parentPolicyId
  **/
  @ApiModelProperty(value = "")
  
    public String getParentPolicyId() {
    return parentPolicyId;
  }

  public void setParentPolicyId(String parentPolicyId) {
    this.parentPolicyId = parentPolicyId;
  }

  public Policy heading(String heading) {
    this.heading = heading;
    return this;
  }

  /**
   * Get heading
   * @return heading
  **/
  @ApiModelProperty(value = "")
  
    public String getHeading() {
    return heading;
  }

  public void setHeading(String heading) {
    this.heading = heading;
  }

  public Policy terms(List<Object> terms) {
    this.terms = terms;
    return this;
  }

  public Policy addTermsItem(Object termsItem) {
    if (this.terms == null) {
      this.terms = new ArrayList<Object>();
    }
    this.terms.add(termsItem);
    return this;
  }

  /**
   * Get terms
   * @return terms
  **/
  @ApiModelProperty(value = "")
  
    public List<Object> getTerms() {
    return terms;
  }

  public void setTerms(List<Object> terms) {
    this.terms = terms;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Policy policy = (Policy) o;
    return Objects.equals(this.id, policy.id) &&
        Objects.equals(this.type, policy.type) &&
        Objects.equals(this.parentPolicyId, policy.parentPolicyId) &&
        Objects.equals(this.heading, policy.heading) &&
        Objects.equals(this.terms, policy.terms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, parentPolicyId, heading, terms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Policy {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    parentPolicyId: ").append(toIndentedString(parentPolicyId)).append("\n");
    sb.append("    heading: ").append(toIndentedString(heading)).append("\n");
    sb.append("    terms: ").append(toIndentedString(terms)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
