package org.example.avion.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder

public class Avion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    Long id_Avion;
    String model;
    String color;
    String matricul;
    double price;
}
