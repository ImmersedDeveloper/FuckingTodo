package io.kjh.programming.todoapp;

import io.kjh.programming.todoapp.entity.Todo;
import io.kjh.programming.todoapp.entity.User;
import io.kjh.programming.todoapp.repository.TodoRepository;
import io.kjh.programming.todoapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoAppApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private TodoRepository todoRepository;

	public static void main(String[] args) {
		SpringApplication.run(TodoAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		User user = new User();
		user.setId(1L);
		user.setPassword("should be hashed");
		user.setUsername("kjh");

		Todo todo = new Todo();
		todo.setId(1L);
		todo.setContent("Upload video to server");

		user.getTodoList().add(todo);

		todoRepository.save(todo);
		userRepository.save(user);
	}
}
