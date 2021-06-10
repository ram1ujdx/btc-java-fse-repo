package com.btc.springboot.example.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorResponse{
	private LocalDateTime timestamp;
	private int status;
	private String error;
	private String message;
	private String path;
	
	
}
