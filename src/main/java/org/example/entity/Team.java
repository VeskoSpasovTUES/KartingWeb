package org.example.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Team {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToMany
    private List<Driver> drivers;

    @OneToMany
    private List<Kart> karts;

    @ManyToMany
    private List<Race> races;

    @ManyToMany
    private List<Result> results;
}
