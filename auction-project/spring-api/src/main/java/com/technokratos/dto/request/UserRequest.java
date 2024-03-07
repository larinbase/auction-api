package com.technokratos.dto.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Модель для создания User")
public record UserRequest(@ApiModelProperty(value = "имя") String name,
                          @ApiModelProperty(value = "пароль")  String password,
                          @ApiModelProperty(value = "email")  String email) {
}
