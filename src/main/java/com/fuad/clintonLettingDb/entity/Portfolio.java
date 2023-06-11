package com.fuad.clintonLettingDb.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = {"client","property"})
public class Portfolio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne(
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,
            optional = true
    )
    @JoinColumn(
            name = "client_id",
            referencedColumnName = "id"
    )
    private Client client;


    @OneToOne(
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,
            optional = true
    )
    @JoinColumn(
            name = "property_id",
            referencedColumnName = "id"
    )
    private Property property;
}
