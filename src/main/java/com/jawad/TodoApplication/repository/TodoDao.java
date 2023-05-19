package com.jawad.TodoApplication.repository;

import com.jawad.TodoApplication.model.Todo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TodoDao {

    private List<Todo> todoList;

    public TodoDao()
    {
        todoList = new ArrayList<>() ;


    }

    public List<Todo> getTodosFromDataSource()
    {
        return todoList;
    }

    public boolean save(Todo todo)
    {
        todoList.add(todo);
        return true;
    }

    public boolean remove(Todo todo)
    {
        todoList.remove(todo);
        return true;
    }

    public boolean update(String id, boolean status)
    {
        boolean updateStatus = false;
        for(Todo todo : todoList)
        {
            if(todo.getId().equals(id))
            {
                remove(todo);

                todo.setTodoStatus(status);

                save(todo);

                return true;

            }

        }
        return false;
    }
}
