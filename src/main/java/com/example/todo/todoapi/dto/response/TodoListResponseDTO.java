package com.example.todo.todoapi.dto.response;

import java.util.List;

public class TodoListResponseDTO {
    private String error; //에러방생시 에러메시지를 담을 필드
    private List<TodoDetailResponseDTO> todos;

}
