package com.technokratos.repository;

import com.technokratos.model.LotEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface LotJpaRepository extends JpaRepository<LotEntity, UUID> {

}
