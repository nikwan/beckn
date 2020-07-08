package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Describes an error object
 */
@ApiModel(description = "Describes an error object")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-06-29T10:47:12.208Z[GMT]")
@JsonInclude(value = Include.NON_NULL)
public class Error   {
  @JsonProperty("t_error")
  private Object tError = null;

  @JsonProperty("r_error")
  private Object rError = null;

  @JsonProperty("f_error")
  @Valid
  private List<Object> fError = null;

  @JsonProperty("d_error")
  private Object dError = null;

  public Error tError(Object tError) {
    this.tError = tError;
    return this;
  }

  /**
   * Get tError
   * @return tError
  **/
  @ApiModelProperty(value = "")
  
    public Object getTError() {
    return tError;
  }

  public void setTError(Object tError) {
    this.tError = tError;
  }

  public Error rError(Object rError) {
    this.rError = rError;
    return this;
  }

  /**
   * Beckn response specific errors. Extension NOT ALLOWED
   * @return rError
  **/
  @ApiModelProperty(required = true, value = "Beckn response specific errors. Extension NOT ALLOWED")
      @NotNull

    public Object getRError() {
    return rError;
  }

  public void setRError(Object rError) {
    this.rError = rError;
  }

  public Error fError(List<Object> fError) {
    this.fError = fError;
    return this;
  }

  public Error addFErrorItem(Object fErrorItem) {
    if (this.fError == null) {
      this.fError = new ArrayList<Object>();
    }
    this.fError.add(fErrorItem);
    return this;
  }

  /**
   * Field specific errors. Extension NOT ALLOWED
   * @return fError
  **/
  @ApiModelProperty(value = "Field specific errors. Extension NOT ALLOWED")
  
    public List<Object> getFError() {
    return fError;
  }

  public void setFError(List<Object> fError) {
    this.fError = fError;
  }

  public Error dError(Object dError) {
    this.dError = dError;
    return this;
  }

  /**
   * Domain specific error object. Extension ALLOWED according to domain specific taxonomies. Refer to domain specific error documentation
   * @return dError
  **/
  @ApiModelProperty(value = "Domain specific error object. Extension ALLOWED according to domain specific taxonomies. Refer to domain specific error documentation")
  
    public Object getDError() {
    return dError;
  }

  public void setDError(Object dError) {
    this.dError = dError;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(this.tError, error.tError) &&
        Objects.equals(this.rError, error.rError) &&
        Objects.equals(this.fError, error.fError) &&
        Objects.equals(this.dError, error.dError);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tError, rError, fError, dError);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    
    sb.append("    tError: ").append(toIndentedString(tError)).append("\n");
    sb.append("    rError: ").append(toIndentedString(rError)).append("\n");
    sb.append("    fError: ").append(toIndentedString(fError)).append("\n");
    sb.append("    dError: ").append(toIndentedString(dError)).append("\n");
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
