package com.jawad.TodoApplication.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Todo {

    private String id;
    //@JsonProperty("todoname")
    private String todoName;
    private boolean todoStatus;

}
