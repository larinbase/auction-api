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
@Table(name = "lot")
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class LotEntity extends AbstractEntity{
    @Column(nullable = false, unique = true)
    private UUID id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String artikul;

    @Column(nullable = false)
    private String status;

    @Column(name = "auction_id",nullable = false)
    private UUID auctionId;

//    @ManyToOne
//    @JoinColumn(referencedColumnName = "id", name = "account_id")
//    private UserEntity accountEntity;
}
