package com.technokratos.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.UUID;


@Getter
@Setter
@SuperBuilder
@MappedSuperclass
@NoArgsConstructor
@AllArgsConstructor
public class AbstractEntity {

    /**
     * Identificator of entity
     */
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID id;
//     *
//     * Дата создания
//
//    @CreationTimestamp
//    @Column(name = "create_date")
//    private Instant createDate;
//
//    *
//     * Дата обновления
//
//    @UpdateTimestamp
//    @Column(name = "updated_date")
//    private Instant updatedDate;

}
