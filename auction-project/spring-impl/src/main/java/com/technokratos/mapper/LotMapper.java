package com.technokratos.mapper;

import com.technokratos.dto.request.LotRequest;
import com.technokratos.dto.response.LotResponse;
import com.technokratos.model.LotEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface LotMapper {
    @Mapping(target = "id", ignore = true)
    LotEntity toEntity(LotRequest lotRequest);

    LotResponse toResponse(LotEntity lotEntity);
}
