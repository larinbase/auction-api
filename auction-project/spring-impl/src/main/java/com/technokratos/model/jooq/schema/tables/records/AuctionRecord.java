/*
 * This file is generated by jOOQ.
 */
package com.technokratos.model.jooq.schema.tables.records;


import com.technokratos.model.jooq.schema.tables.Auction;
import com.technokratos.model.jooq.schema.tables.pojos.AuctionEntity;

import java.util.UUID;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Аукцион
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AuctionRecord extends UpdatableRecordImpl<AuctionRecord> implements Record4<UUID, String, UUID, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.auction.id</code>.
     */
    public void setId(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.auction.id</code>.
     */
    public UUID getId() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>public.auction.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.auction.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.auction.account_id</code>.
     */
    public void setAccountId(UUID value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.auction.account_id</code>.
     */
    public UUID getAccountId() {
        return (UUID) get(2);
    }

    /**
     * Setter for <code>public.auction.status</code>.
     */
    public void setStatus(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.auction.status</code>.
     */
    public String getStatus() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UUID> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<UUID, String, UUID, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<UUID, String, UUID, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<UUID> field1() {
        return Auction.AUCTION_ENTITY.ID;
    }

    @Override
    public Field<String> field2() {
        return Auction.AUCTION_ENTITY.NAME;
    }

    @Override
    public Field<UUID> field3() {
        return Auction.AUCTION_ENTITY.ACCOUNT_ID;
    }

    @Override
    public Field<String> field4() {
        return Auction.AUCTION_ENTITY.STATUS;
    }

    @Override
    public UUID component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public UUID component3() {
        return getAccountId();
    }

    @Override
    public String component4() {
        return getStatus();
    }

    @Override
    public UUID value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public UUID value3() {
        return getAccountId();
    }

    @Override
    public String value4() {
        return getStatus();
    }

    @Override
    public AuctionRecord value1(UUID value) {
        setId(value);
        return this;
    }

    @Override
    public AuctionRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public AuctionRecord value3(UUID value) {
        setAccountId(value);
        return this;
    }

    @Override
    public AuctionRecord value4(String value) {
        setStatus(value);
        return this;
    }

    @Override
    public AuctionRecord values(UUID value1, String value2, UUID value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AuctionRecord
     */
    public AuctionRecord() {
        super(Auction.AUCTION_ENTITY);
    }

    /**
     * Create a detached, initialised AuctionRecord
     */
    public AuctionRecord(UUID id, String name, UUID accountId, String status) {
        super(Auction.AUCTION_ENTITY);

        setId(id);
        setName(name);
        setAccountId(accountId);
        setStatus(status);
    }

    /**
     * Create a detached, initialised AuctionRecord
     */
    public AuctionRecord(AuctionEntity value) {
        super(Auction.AUCTION_ENTITY);

        if (value != null) {
            setId(value.getId());
            setName(value.getName());
            setAccountId(value.getAccountId());
            setStatus(value.getStatus());
        }
    }
}
