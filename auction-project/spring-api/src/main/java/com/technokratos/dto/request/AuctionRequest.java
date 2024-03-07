package com.technokratos.dto.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.UUID;
@ApiModel(description = "Модель для создания Auction")
public record AuctionRequest(@ApiModelProperty(value = "имя") String name,
                             @ApiModelProperty(value = "статус") String status,
                             @ApiModelProperty(value = "id пользователя") UUID accountId) {
}
