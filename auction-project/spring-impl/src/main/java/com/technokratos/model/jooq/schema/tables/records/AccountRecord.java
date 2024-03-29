/*
 * This file is generated by jOOQ.
 */
package com.technokratos.model.jooq.schema.tables.records;


import com.technokratos.model.jooq.schema.tables.Account;
import com.technokratos.model.jooq.schema.tables.pojos.AccountEntity;

import java.util.UUID;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Аккаунт
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AccountRecord extends UpdatableRecordImpl<AccountRecord> implements Record4<UUID, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.account.id</code>.
     */
    public void setId(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.account.id</code>.
     */
    public UUID getId() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>public.account.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.account.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.account.password</code>.
     */
    public void setPassword(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.account.password</code>.
     */
    public String getPassword() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.account.email</code>.
     */
    public void setEmail(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.account.email</code>.
     */
    public String getEmail() {
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
    public Row4<UUID, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<UUID, String, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<UUID> field1() {
        return Account.ACCOUNT_ENTITY.ID;
    }

    @Override
    public Field<String> field2() {
        return Account.ACCOUNT_ENTITY.NAME;
    }

    @Override
    public Field<String> field3() {
        return Account.ACCOUNT_ENTITY.PASSWORD;
    }

    @Override
    public Field<String> field4() {
        return Account.ACCOUNT_ENTITY.EMAIL;
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
    public String component3() {
        return getPassword();
    }

    @Override
    public String component4() {
        return getEmail();
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
    public String value3() {
        return getPassword();
    }

    @Override
    public String value4() {
        return getEmail();
    }

    @Override
    public AccountRecord value1(UUID value) {
        setId(value);
        return this;
    }

    @Override
    public AccountRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public AccountRecord value3(String value) {
        setPassword(value);
        return this;
    }

    @Override
    public AccountRecord value4(String value) {
        setEmail(value);
        return this;
    }

    @Override
    public AccountRecord values(UUID value1, String value2, String value3, String value4) {
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
     * Create a detached AccountRecord
     */
    public AccountRecord() {
        super(Account.ACCOUNT_ENTITY);
    }

    /**
     * Create a detached, initialised AccountRecord
     */
    public AccountRecord(UUID id, String name, String password, String email) {
        super(Account.ACCOUNT_ENTITY);

        setId(id);
        setName(name);
        setPassword(password);
        setEmail(email);
    }

    /**
     * Create a detached, initialised AccountRecord
     */
    public AccountRecord(AccountEntity value) {
        super(Account.ACCOUNT_ENTITY);

        if (value != null) {
            setId(value.getId());
            setName(value.getName());
            setPassword(value.getPassword());
            setEmail(value.getEmail());
        }
    }
}
