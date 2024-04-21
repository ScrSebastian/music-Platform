package com.example.musicplatform.response;

import lombok.Data;

import java.util.List;

@Data
public class ApiResponse<T> {
    private List<T> data;
    private int total;

}
