package com.technokratos.repository;

import com.technokratos.model.AwardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AwardJpaRepository extends JpaRepository<AwardEntity, UUID> {
}
