package org.example.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Kart {
    @Id
    @GeneratedValue
    private Long id;

    private double horsePower;

    private double weight;

    @ManyToMany(mappedBy = "team")
    private List<Driver> drivers;

    @ManyToOne
    private Team team;
}
