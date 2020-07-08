package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import io.swagger.annotations.ApiModel;

@ApiModel(description = "Describes a provider. APi")
@JsonInclude(value = Include.NON_NULL)
public class Api {

}
