package io.swagger.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Describes the domain of an object. Maintained by Beckn Foundation
 */
public enum Domain {
  MOBILITY("MOBILITY"),
    FINAL_MILE_DELIVERY("FINAL-MILE-DELIVERY"),
    FOOD_AND_BEVERAGE("FOOD-AND-BEVERAGE");

  private String value;

  Domain(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static Domain fromValue(String text) {
    for (Domain b : Domain.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
