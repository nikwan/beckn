package io.swagger.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Describes the service catalog
 */
@ApiModel(description = "Describes the service catalog")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-06-29T10:47:12.208Z[GMT]")
public class Catalog   {
  @JsonProperty("category_tree")
  private Category categoryTree = null;

  @JsonProperty("items")
  @Valid
  private List<Item> items = null;

  public Catalog categoryTree(Category categoryTree) {
    this.categoryTree = categoryTree;
    return this;
  }

  /**
   * Get categoryTree
   * @return categoryTree
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public Category getCategoryTree() {
    return categoryTree;
  }

  public void setCategoryTree(Category categoryTree) {
    this.categoryTree = categoryTree;
  }

  public Catalog items(List<Item> items) {
    this.items = items;
    return this;
  }

  public Catalog addItemsItem(Item itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<Item>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Get items
   * @return items
  **/
  @ApiModelProperty(value = "")
      @Valid
    public List<Item> getItems() {
    return items;
  }

  public void setItems(List<Item> items) {
    this.items = items;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Catalog catalog = (Catalog) o;
    return Objects.equals(this.categoryTree, catalog.categoryTree) &&
        Objects.equals(this.items, catalog.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryTree, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Catalog {\n");
    
    sb.append("    categoryTree: ").append(toIndentedString(categoryTree)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
