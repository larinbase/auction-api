package com.technokratos.dto.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.UUID;
@ApiModel(description = "Модель для создания Lot")
public record LotRequest(@ApiModelProperty(value = "имя") String name,
                         @ApiModelProperty(value = "описание") String description,
                         @ApiModelProperty(value = "артикул") String artikul,
                         @ApiModelProperty(value = "статус") String status,
                         @ApiModelProperty(value = "id аукциона") UUID auctionId) {
}
