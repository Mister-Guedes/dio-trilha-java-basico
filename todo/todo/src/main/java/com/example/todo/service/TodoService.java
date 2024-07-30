package com.example.todo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.exemplo.todo.model.Todo;
import com.exemplo.todo.repository.TodoRepository;

import java.util.List;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
    }

    public Todo getTodoById(Long id) {
        return todoRepository.findById(id).orElse(null);
    }

    public Todo createTodo(Todo todo) {
        return todoRepository.save(todo);
    }

    public Todo updateTodo(Long id, Todo todoDetails) {
        Todo todo = todoRepository.findById(id).orElse(null);
        if (todo != null) {
            todo.setTitle(todoDetails.getTitle());
            todo.setDescription(todoDetails.getDescription());
            todo.setCompleted(todoDetails.isCompleted());
            return todoRepository.save(todo);
        }
        return null;
    }

    public void deleteTodoById(Long id) {
        todoRepository.deleteById(id);
    }
}

