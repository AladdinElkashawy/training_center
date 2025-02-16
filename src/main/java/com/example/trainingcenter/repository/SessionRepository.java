package com.example.trainingcenter.repository;

import com.example.trainingcenter.entity.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Integer> {
}