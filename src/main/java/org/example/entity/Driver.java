package org.example.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Driver {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private int age;

    private String email;

    @ManyToMany(mappedBy = "team")
    private List<Kart> karts;

    @ManyToOne
    private Team team;

    @ManyToMany (mappedBy = "race")
    private List<Race> races;

    @ManyToMany
    private List<Result> results;
}
