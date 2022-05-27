package io.kjh.programming.todoapp.repository;

import io.kjh.programming.todoapp.entity.Todo;
import io.kjh.programming.todoapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

}
