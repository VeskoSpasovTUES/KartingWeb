package org.example.entity;

import jakarta.persistence.*;
import lombok.Data;

import javax.xml.transform.Result;
import java.util.List;

@Entity
@Data
public class Race {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String location;

    private String date;

    private String time;

    private String winner;

    @ManyToOne
    private Track track;

    @ManyToMany
    private List<Driver> drivers;

    @ManyToMany
    private List<Team> teams;

    @OneToMany
    private List<Result> results;
}
