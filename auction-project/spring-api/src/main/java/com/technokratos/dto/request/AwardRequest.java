package com.technokratos.dto.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.UUID;

@ApiModel(description = "Модель для создания Award")
public record AwardRequest(@ApiModelProperty(value = "id лота") UUID lotId,
                           @ApiModelProperty(value = "id пользователя") UUID accountId) {
}
