package com.example.demo.repository;

import com.example.demo.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepo extends JpaRepository<Team, Long> {
}
