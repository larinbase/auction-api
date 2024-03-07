package com.technokratos.repository;

import com.technokratos.dto.request.UserRequest;
import com.technokratos.model.UserEntity;

import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public interface UserRepository {
    Optional<UserEntity> findById(UUID uuid);
    Optional<Set<UserEntity>> findAll();
    UUID save(UserRequest user);
    void delete(UserEntity user);
    void updateName(UserEntity user, String name);
    void update(UserEntity user);
}
