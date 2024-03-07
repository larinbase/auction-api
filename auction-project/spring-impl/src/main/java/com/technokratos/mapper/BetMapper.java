package com.technokratos.mapper;

import com.technokratos.dto.request.BetRequest;
import com.technokratos.dto.response.BetResponse;
import com.technokratos.model.BetEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface BetMapper {
    @Mapping(target = "id", ignore = true)
    BetEntity toEntity(BetRequest betRequest);

    BetResponse toResponse(BetEntity betEntity);
}
