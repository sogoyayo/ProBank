package com.probank.common.dto;

import java.time.LocalDateTime;

public class ErrorResponse {
    private String status = "error";
    private String message;
    private ErrorDetails error;
    private LocalDateTime timestamp;

    public ErrorResponse(String message, ErrorDetails error) {
        this.message = message;
        this.error = error;
        this.timestamp = LocalDateTime.now();
    }

    public static class ErrorDetails {
        private int code;
        private String details;

        public ErrorDetails(int code, String details) {
            this.code = code;
            this.details = details;
        }

        // Getters and setters...
    }

    // Getters and setters...
}

