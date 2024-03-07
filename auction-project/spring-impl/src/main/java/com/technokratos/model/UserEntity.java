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
@Table(name = "account")
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity extends AbstractEntity {
    @Column(nullable = false, unique = true)
    private UUID uuid;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String email;
}
