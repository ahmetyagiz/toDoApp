package com.ahmetyagiz.service;

import com.ahmetyagiz.entities.Todo;
import com.ahmetyagiz.exception.TodoNotFoundException;
import com.ahmetyagiz.repository.TodoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public Todo getById(Long id) {
        return todoRepository.findById(id).
                orElseThrow(() -> new RuntimeException("Todo not found with id: " + id));
    }

    public List<Todo> findAll() {
        return todoRepository.findAll();
    }

    public List<Todo> getCompletedTodos() {
        return todoRepository.findByCompleted(true);
    }

    public Todo save(Todo todo) {
        return todoRepository.save(todo);
    }

    public Todo updateTodo(Long id, Todo updatedTodo) {
        Todo existingTodo = todoRepository.findById(id).
                orElseThrow(() -> new TodoNotFoundException(id.toString()));

        if (updatedTodo.getTitle() != null) {
            existingTodo.setTitle(updatedTodo.getTitle());
        }
        existingTodo.setCompleted(updatedTodo.isCompleted());

        return todoRepository.save(existingTodo);
    }

    public void deleteById(Long id) {
        todoRepository.deleteById(id);
    }
}
