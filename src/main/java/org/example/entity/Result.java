package org.example.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Result {
    @Id
    @GeneratedValue
    private Long id;

    private int year;

    private Race race;

    @ManyToMany
    private List<Driver> drivers;

    @ManyToMany
    private List<Team> teams;
}
