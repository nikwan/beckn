package io.swagger.model;

import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;
import org.threeten.bp.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Describes the beckn message packet context
 */
@ApiModel(description = "Describes the beckn message packet context")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-06-29T10:47:12.208Z[GMT]")
public class Context   {
  @JsonProperty("domain")
  private Domain domain = null;

  /**
   * Gets or Sets action
   */
  public enum ActionEnum {
    SEARCH("search"),
    
    SELECT("select"),
    
    CONFIRM("confirm"),
    
    ADD("add"),
    
    REMOVE("remove"),
    
    COMPLETE("complete"),
    
    CANCEL("cancel"),
    
    UPDATE("update"),
    
    ON_SEARCH("on_search"),
    
    ON_SELECT("on_select"),
    
    ON_CONFIRM("on_confirm"),
    
    ON_ADD("on_add"),
    
    ON_REMOVE("on_remove"),
    
    ON_CANCEL("on_cancel"),
    
    ON_UPDATE("on_update"),
    
    REGISTER("register"),
    
    ON_REGISTER("on_register"),
    
    LOOKUP("lookup"),
    
    ON_LOOKUP("on_lookup"),
    
    TOKENS("tokens"),
    
    ON_TOKENS("on_tokens");

    private String value;

    ActionEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ActionEnum fromValue(String text) {
      for (ActionEnum b : ActionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("action")
  private ActionEnum action = null;

  @JsonProperty("version")
  private String version = null;

  @JsonProperty("transaction_id")
  private String transactionId = null;

  @JsonProperty("message_id")
  private String messageId = null;

  @JsonProperty("timestamp")
  private OffsetDateTime timestamp = null;

  public Context domain(Domain domain) {
    this.domain = domain;
    return this;
  }

  /**
   * Get domain
   * @return domain
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public Domain getDomain() {
    return domain;
  }

  public void setDomain(Domain domain) {
    this.domain = domain;
  }

  public Context action(ActionEnum action) {
    this.action = action;
    return this;
  }

  /**
   * Get action
   * @return action
  **/
  @ApiModelProperty(value = "")
  
    public ActionEnum getAction() {
    return action;
  }

  public void setAction(ActionEnum action) {
    this.action = action;
  }

  public Context version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(value = "")
  
    public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public Context transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

  /**
   * Get transactionId
   * @return transactionId
  **/
  @ApiModelProperty(value = "")
  
    public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public Context messageId(String messageId) {
    this.messageId = messageId;
    return this;
  }

  /**
   * Get messageId
   * @return messageId
  **/
  @ApiModelProperty(value = "")
  
    public String getMessageId() {
    return messageId;
  }

  public void setMessageId(String messageId) {
    this.messageId = messageId;
  }

  public Context timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   * @return timestamp
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Context context = (Context) o;
    return Objects.equals(this.domain, context.domain) &&
        Objects.equals(this.action, context.action) &&
        Objects.equals(this.version, context.version) &&
        Objects.equals(this.transactionId, context.transactionId) &&
        Objects.equals(this.messageId, context.messageId) &&
        Objects.equals(this.timestamp, context.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domain, action, version, transactionId, messageId, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Context {\n");
    
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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
