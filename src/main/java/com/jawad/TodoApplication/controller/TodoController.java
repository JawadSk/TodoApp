package com.jawad.TodoApplication.controller;

import com.jawad.TodoApplication.model.Todo;
import com.jawad.TodoApplication.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/todoPackage")
public class TodoController {

        @Autowired
        TodoService todoService;

        @GetMapping(value = "/getAllTodos")
        public List<Todo> getAllTodos()
        {
            return todoService.getAllTodos();
        }

        @GetMapping(value = "/getTodosByStatus")
        public List<Todo> getTodosByStatus(@RequestParam String status)
        {
            return todoService.getTodosByUserStatus(status);
        }

        @RequestMapping(value = "/getTodoById/{id}",method = RequestMethod.GET)
        public Todo getTodoById(@PathVariable String id)
        {
            return todoService.getTodoBasedOnId(id);
        }

        @PostMapping(value = "/addTodo")
        public String addTodo(@RequestBody Todo todo)
        {
            return  todoService.addMyTodo(todo);
        }

        @DeleteMapping(value = "/deleteTodoById/{id}")
        public String deleteTodoById(@PathVariable String id)
        {
            return todoService.removeTodoById(id);
        }


        @PutMapping(value = "/updateTodoById/{id}/{status}")
        public String updateTodoStatusById(@PathVariable String id, @PathVariable String status)
        {
            return todoService.updateTodoStatusById(id,status);
        }
}
