package com.ahmetyagiz.controller;

import com.ahmetyagiz.entities.Todo;
import com.ahmetyagiz.service.TodoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/todos")
public class TodoController {

    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping("/{id}")
    public Todo getById(@PathVariable Long id) {
        return todoService.getById(id);
    }

    @GetMapping
    public List<Todo> getAllTodos() {
        return todoService.findAll();
    }

    @GetMapping("/completed")
    public ResponseEntity<List<Todo>> getCompletedTodos() {
        return ResponseEntity.ok(todoService.getCompletedTodos());
    }

    @PostMapping
    public Todo createTodo(@RequestBody Todo todo) {
        return todoService.save(todo);
    }

    @PutMapping("/{id}")
    public Todo updateTodo(@PathVariable Long id, @RequestBody Todo updatedTodo) {
        return todoService.updateTodo(id, updatedTodo);
    }

    @DeleteMapping("/{id}")
    public void deleteTodoById(@PathVariable Long id) {
        todoService.deleteById(id);
    }

}
