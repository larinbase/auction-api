package com.technokratos.mapper;

import com.technokratos.dto.request.AuctionRequest;
import com.technokratos.dto.response.AuctionResponse;
import com.technokratos.model.AuctionEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AuctionMapper {
    @Mapping(target = "id", ignore = true)
    AuctionEntity toEntity(AuctionRequest auctionRequest);

    AuctionResponse toResponse(AuctionEntity auctionEntity);
}
