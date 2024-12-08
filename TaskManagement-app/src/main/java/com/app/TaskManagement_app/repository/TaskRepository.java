package com.app.TaskManagement_app.repository;

import com.app.TaskManagement_app.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
