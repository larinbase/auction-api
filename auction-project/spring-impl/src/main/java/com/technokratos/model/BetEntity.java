package com.technokratos.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Date;
import java.util.UUID;

@Getter
@Entity
@Table(name = "bet")
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class BetEntity extends AbstractEntity{
    @Column(nullable = false, unique = true)
    private UUID id;

    @Column(nullable = false)
    private Double amount;

    @Column(nullable = false)
    private Date date_time;

    @Column(name="lot_id", nullable = false)
    private UUID lotId;

    @Column(name="account_id", nullable = false)
    private UUID accountId;
}
