package org.example.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Track {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String location;

    private double length;

    @OneToMany
    private List<Race> races;
}
