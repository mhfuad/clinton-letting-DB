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
@ToString(exclude = "partUsed")
public class Repair {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String repair_details;
    private Long property_id;
    @OneToOne(
            mappedBy = "repair"
    )
    private PartUsed partUsed;
}
