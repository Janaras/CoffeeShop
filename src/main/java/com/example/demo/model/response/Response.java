package com.example.demo.model.response;

import lombok.AccessLevel;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@RequiredArgsConstructor // final
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class Response {

    final Object data;
    final String message;
}
