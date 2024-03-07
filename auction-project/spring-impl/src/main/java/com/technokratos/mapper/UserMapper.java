package com.technokratos.mapper;

import com.technokratos.dto.request.UserRequest;
import com.technokratos.dto.response.UserResponse;
import com.technokratos.model.UserEntity;
import com.technokratos.model.jooq.schema.tables.pojos.AccountEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(target = "id", ignore = true)
    AccountEntity toEntity(UserRequest userRequest); // UserEntity

    UserResponse toResponse(AccountEntity userEntity); //UserEntity
}