package com.technokratos.mapper;

import com.technokratos.dto.request.AwardRequest;
import com.technokratos.dto.response.AwardResponse;
import com.technokratos.model.AwardEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AwardMapper {
    @Mapping(target = "id", ignore = true)
    AwardEntity toEntity(AwardRequest awardRequest);

    AwardResponse toResponse(AwardEntity awardEntity);
}
