package org.example.repository;

import org.example.entity.Race;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RaceRepository extends JpaRepository <Race, Long> {}
