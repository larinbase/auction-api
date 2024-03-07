package com.technokratos.repository;

import com.technokratos.model.AuctionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AuctionJpaRepository extends JpaRepository<AuctionEntity, UUID> {
//    @Override
//    Optional<AuctionEntity> findById(UUID id);
//
//    @Override
//    List<AuctionEntity> findAll();
//
//    UUID save(AuctionRequest auctionRequest);
}
