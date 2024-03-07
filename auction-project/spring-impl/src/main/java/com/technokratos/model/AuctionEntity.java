package com.technokratos.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import javax.persistence.Entity;
import java.util.UUID;

@Getter
@Entity
@Table(name = "auction")
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class AuctionEntity extends AbstractEntity{
    @Column(nullable = false, unique = true)
    private UUID id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String status;

    @Column(name = "account_id",nullable = false)
    private UUID accountId;

//    @ManyToOne
//    @JoinColumn(referencedColumnName = "id", name = "account_id")
//    private UserEntity accountEntity;
}
