package com.example.taskapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.taskapi.entity.*;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
