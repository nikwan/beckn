package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Describes the price of a object. Allows for domain extension.
 */
@ApiModel(description = "Describes the price of a object. Allows for domain extension.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-06-29T10:47:12.208Z[GMT]")
public class Price   {
  @JsonProperty("currency")
  private String currency = null;

  @JsonProperty("estimated_value")
  private BigDecimal estimatedValue = null;

  @JsonProperty("computed_value")
  private BigDecimal computedValue = null;

  @JsonProperty("listed_value")
  private BigDecimal listedValue = null;

  @JsonProperty("offered_value")
  private BigDecimal offeredValue = null;

  @JsonProperty("unit")
  private String unit = null;

  @JsonProperty("discount")
  private BigDecimal discount = null;

  @JsonProperty("tax")
  private Object tax = null;

  public Price currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
  **/
  @ApiModelProperty(value = "")
  
    public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public Price estimatedValue(BigDecimal estimatedValue) {
    this.estimatedValue = estimatedValue;
    return this;
  }

  /**
   * Get estimatedValue
   * @return estimatedValue
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public BigDecimal getEstimatedValue() {
    return estimatedValue;
  }

  public void setEstimatedValue(BigDecimal estimatedValue) {
    this.estimatedValue = estimatedValue;
  }

  public Price computedValue(BigDecimal computedValue) {
    this.computedValue = computedValue;
    return this;
  }

  /**
   * Get computedValue
   * @return computedValue
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public BigDecimal getComputedValue() {
    return computedValue;
  }

  public void setComputedValue(BigDecimal computedValue) {
    this.computedValue = computedValue;
  }

  public Price listedValue(BigDecimal listedValue) {
    this.listedValue = listedValue;
    return this;
  }

  /**
   * Get listedValue
   * @return listedValue
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public BigDecimal getListedValue() {
    return listedValue;
  }

  public void setListedValue(BigDecimal listedValue) {
    this.listedValue = listedValue;
  }

  public Price offeredValue(BigDecimal offeredValue) {
    this.offeredValue = offeredValue;
    return this;
  }

  /**
   * Get offeredValue
   * @return offeredValue
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public BigDecimal getOfferedValue() {
    return offeredValue;
  }

  public void setOfferedValue(BigDecimal offeredValue) {
    this.offeredValue = offeredValue;
  }

  public Price unit(String unit) {
    this.unit = unit;
    return this;
  }

  /**
   * Get unit
   * @return unit
  **/
  @ApiModelProperty(value = "")
  
    public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }

  public Price discount(BigDecimal discount) {
    this.discount = discount;
    return this;
  }

  /**
   * Get discount
   * @return discount
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public BigDecimal getDiscount() {
    return discount;
  }

  public void setDiscount(BigDecimal discount) {
    this.discount = discount;
  }

  public Price tax(Object tax) {
    this.tax = tax;
    return this;
  }

  /**
   * Get tax
   * @return tax
  **/
  @ApiModelProperty(value = "")
  
    public Object getTax() {
    return tax;
  }

  public void setTax(Object tax) {
    this.tax = tax;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Price price = (Price) o;
    return Objects.equals(this.currency, price.currency) &&
        Objects.equals(this.estimatedValue, price.estimatedValue) &&
        Objects.equals(this.computedValue, price.computedValue) &&
        Objects.equals(this.listedValue, price.listedValue) &&
        Objects.equals(this.offeredValue, price.offeredValue) &&
        Objects.equals(this.unit, price.unit) &&
        Objects.equals(this.discount, price.discount) &&
        Objects.equals(this.tax, price.tax);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, estimatedValue, computedValue, listedValue, offeredValue, unit, discount, tax);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Price {\n");
    
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    estimatedValue: ").append(toIndentedString(estimatedValue)).append("\n");
    sb.append("    computedValue: ").append(toIndentedString(computedValue)).append("\n");
    sb.append("    listedValue: ").append(toIndentedString(listedValue)).append("\n");
    sb.append("    offeredValue: ").append(toIndentedString(offeredValue)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
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
