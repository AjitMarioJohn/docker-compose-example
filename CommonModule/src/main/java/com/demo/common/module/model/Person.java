package com.demo.common.module.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@ApiModel(value = "Request that contains person full name")
public class Person {
    @ApiModelProperty(value = "Name of the person")
    @NotNull
    @NotBlank
    @NotEmpty
    private String name;
    @ApiModelProperty(value = "Surname of the person")
    @NotNull
    @NotBlank
    @NotEmpty
    private String surname;
}
