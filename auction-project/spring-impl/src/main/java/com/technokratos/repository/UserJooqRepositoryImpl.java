package com.technokratos.repository;

import com.technokratos.model.jooq.schema.Tables;
import com.technokratos.model.jooq.schema.tables.pojos.AccountEntity;
import com.technokratos.model.jooq.schema.tables.pojos.AuctionEntity;
import com.technokratos.model.jooq.schema.tables.records.AccountRecord;
import lombok.RequiredArgsConstructor;
import org.jooq.DSLContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


@Repository
@RequiredArgsConstructor
public class UserJooqRepositoryImpl implements UserJooqRepository{

    private final DSLContext jooq;

    @Override
    public Optional<AccountEntity> findById(final UUID id) {
        return jooq.select(Tables.ACCOUNT_ENTITY.fields())
                .from(Tables.ACCOUNT_ENTITY)
                .where(Tables.ACCOUNT_ENTITY.ID.eq(id))
                .fetchOptionalInto(AccountEntity.class);
    }

    @Override
    public List<AccountEntity> findAll() {
        return jooq.select(Tables.ACCOUNT_ENTITY.fields())
                .from(Tables.ACCOUNT_ENTITY)
                .fetchInto(AccountEntity.class);
    }

    @Override
    public Optional<AccountEntity> save(AccountEntity user) {
        return jooq.insertInto(Tables.ACCOUNT_ENTITY)
                .set(Tables.ACCOUNT_ENTITY.NAME, user.getName())
                .set(Tables.ACCOUNT_ENTITY.EMAIL, user.getEmail())
                .set(Tables.ACCOUNT_ENTITY.PASSWORD, user.getPassword())
                .returning()
                .fetchOptionalInto(AccountEntity.class);
    }

    @Override
    public Optional<AccountEntity> update(AccountEntity user) {
        return jooq.update(Tables.ACCOUNT_ENTITY)
                .set(jooq.newRecord(Tables.ACCOUNT_ENTITY, user))
                .where(Tables.ACCOUNT_ENTITY.ID.eq(user.getId()))
                .returning()
                .fetchOptionalInto(AccountEntity.class);
    }

    @Override
    public Boolean delete(UUID id) {
        return jooq.deleteFrom(Tables.ACCOUNT_ENTITY)
                .where(Tables.ACCOUNT_ENTITY.ID.eq(id))
                .execute() == 1;
    }

    @Override
    public void save(List<AccountEntity> accountEntityList) {
        for (AccountEntity user: accountEntityList
             ) {
            jooq.insertInto(Tables.ACCOUNT_ENTITY)
                    .set(Tables.ACCOUNT_ENTITY.NAME, user.getName())
                    .set(Tables.ACCOUNT_ENTITY.EMAIL, user.getEmail())
                    .set(Tables.ACCOUNT_ENTITY.PASSWORD, user.getPassword())
                    .returning()
                    .fetchOptionalInto(AccountEntity.class);
        }
    }

    @Override
    public List<AccountEntity> getAuctions(UUID id) {
        return jooq.select()
                .from(Tables.ACCOUNT_ENTITY)
                .join(Tables.AUCTION_ENTITY).on(Tables.ACCOUNT_ENTITY.ID.eq(Tables.AUCTION_ENTITY.ACCOUNT_ID))
                .where(Tables.ACCOUNT_ENTITY.ID.eq(id))
                .fetchInto(AccountEntity.class);
    }

    @Override
    public Page<AccountEntity> getAllByPages(Pageable pageable) {
        return null;
    }
}
