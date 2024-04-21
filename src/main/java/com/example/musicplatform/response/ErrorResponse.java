package com.example.musicplatform.response;

import lombok.Data;

@Data
public class ErrorResponse {
    private int err;
    private String msg;

}
