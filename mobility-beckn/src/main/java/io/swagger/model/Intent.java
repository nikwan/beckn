package io.swagger.model;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(value = Include.NON_NULL)
public class Intent {
	 private String query_string;
	 Provider ProviderObject;
	 Category CategoryObject;
	 Brand BrandObject;
	 Item ItemObject;
	 ArrayList < Object > tags = new ArrayList < Object > ();


	 // Getter Methods 

	 public String getQuery_string() {
	  return query_string;
	 }

	 public Provider getProvider() {
	  return ProviderObject;
	 }

	 public Category getCategory() {
	  return CategoryObject;
	 }

	 public Brand getBrand() {
	  return BrandObject;
	 }

	 public Item getItem() {
	  return ItemObject;
	 }

	 // Setter Methods 

	 public void setQuery_string(String query_string) {
	  this.query_string = query_string;
	 }

	 public void setProvider(Provider providerObject) {
	  this.ProviderObject = providerObject;
	 }

	 public void setCategory(Category categoryObject) {
	  this.CategoryObject = categoryObject;
	 }

	 public void setBrand(Brand brandObject) {
	  this.BrandObject = brandObject;
	 }

	 public void setItem(Item itemObject) {
	  this.ItemObject = itemObject;
	 }
	}
