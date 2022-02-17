package com.comviva.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.comviva.app.dto.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {

}
