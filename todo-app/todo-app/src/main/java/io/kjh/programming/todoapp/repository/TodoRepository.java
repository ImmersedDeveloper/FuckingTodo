package io.kjh.programming.todoapp.repository;

import io.kjh.programming.todoapp.entity.Todo;
import io.kjh.programming.todoapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
