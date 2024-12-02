package com.probank.common.util;

import com.probank.common.dto.ApiResponse;
import com.probank.common.dto.ErrorResponse;
import org.springframework.http.ResponseEntity;

public class ResponseUtil {
    public static <T> ResponseEntity<ApiResponse<T>> success(String message, T data) {
        ApiResponse<T> response = new ApiResponse<>("success", message, data);
        return ResponseEntity.ok(response);
    }

    public static ResponseEntity<ErrorResponse> error(String message, int code, String details) {
        ErrorResponse.ErrorDetails errorDetails = new ErrorResponse.ErrorDetails(code, details);
        ErrorResponse response = new ErrorResponse(message, errorDetails);
        return ResponseEntity.status(code).body(response);
    }
}
