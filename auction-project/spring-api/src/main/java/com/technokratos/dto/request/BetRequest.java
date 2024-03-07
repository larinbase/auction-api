package com.technokratos.dto.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.UUID;

@ApiModel(description = "Модель для создания Bet")
public record BetRequest(@ApiModelProperty(value = "размер ставки") Double amount,
                         @ApiModelProperty(value = "описание") String dateTime,
                         @ApiModelProperty(value = "id лота") UUID lotId,
                         @ApiModelProperty(value = "id пользователя") UUID accountId) {
}
