package com.melihcan.learning.StompMessaging.core.utility.response;

import jakarta.annotation.Nullable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiResponse<T> {
    private int status;

    @Nullable
    private T data;

    @Nullable
    private String error;
}
