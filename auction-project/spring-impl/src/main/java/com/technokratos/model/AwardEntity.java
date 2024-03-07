package com.technokratos.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.UUID;

@Getter
@Entity
@Table(name = "award")
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class AwardEntity extends AbstractEntity{
    @Column(nullable = false, unique = true)
    private UUID id;

    @Column(name="lot_id", nullable = false)
    private UUID lotId;

    @Column(name="account_id", nullable = false)
    private UUID accountId;
}
