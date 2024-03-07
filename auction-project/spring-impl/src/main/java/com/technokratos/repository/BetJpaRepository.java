package com.technokratos.repository;

import com.technokratos.model.BetEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BetJpaRepository extends JpaRepository<BetEntity, UUID> {
}
