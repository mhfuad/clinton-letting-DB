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
@ToString(exclude = {"repair", "part"})
public class PartUsed {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long part_used;
    private Long quantity;

    @OneToOne(
            fetch = FetchType.EAGER,
            cascade = CascadeType.ALL,
            optional = false
    )
    @JoinColumn(
            name = "repair_id",
            referencedColumnName = "id"
    )
    private Repair repair;
    @OneToOne(
            fetch = FetchType.EAGER,
            cascade = CascadeType.ALL,
            optional = false
    )
    @JoinColumn(
            name = "part_id",
            referencedColumnName = "id"
    )
    private Part part;

}
