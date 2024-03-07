package com.technokratos.repository;

import com.technokratos.model.jooq.schema.tables.pojos.AccountEntity;
import com.technokratos.model.jooq.schema.tables.pojos.AuctionEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserJooqRepository {
    Optional<AccountEntity> findById(UUID id);
    List<AccountEntity> findAll();
    Optional<AccountEntity> save(AccountEntity user);
    Optional<AccountEntity> update(AccountEntity user);
    Boolean delete(UUID id);
    void save(List<AccountEntity> accountEntityList);
    List<AccountEntity> getAuctions(UUID id);
    Page<AccountEntity> getAllByPages(Pageable pageable);
}
