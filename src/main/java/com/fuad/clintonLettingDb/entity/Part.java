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
public class Part {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String part_code;
    private String part_name;
    @OneToOne(
            mappedBy = "part"
    )
    private PartUsed partUsed;
}
