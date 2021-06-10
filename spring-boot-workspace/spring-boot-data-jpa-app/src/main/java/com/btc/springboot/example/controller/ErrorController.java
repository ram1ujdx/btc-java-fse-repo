package com.btc.springboot.example.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.btc.springboot.example.dto.ErrorResponse;
import com.btc.springboot.example.exception.PersonAlreadyExistsException;
import com.btc.springboot.example.exception.PersonNotFoundException;

@RestControllerAdvice
public class ErrorController {

	@ExceptionHandler(PersonAlreadyExistsException.class)
	@ResponseStatus(HttpStatus.CONFLICT)
	public ErrorResponse handlePersonAlreadyExistsError(PersonAlreadyExistsException ex, HttpServletRequest request) {
		
		ErrorResponse errResponse=new ErrorResponse(LocalDateTime.now(),
				HttpStatus.CONFLICT.value(),
				HttpStatus.CONFLICT.getReasonPhrase(),
				ex.getMessage(),
				request.getRequestURI());
		return errResponse;
	}
	
	
	@ExceptionHandler(PersonNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public ErrorResponse handlePersonNotFoundException(PersonNotFoundException ex, HttpServletRequest request) {
		
		ErrorResponse errResponse=new ErrorResponse(LocalDateTime.now(),
				HttpStatus.NOT_FOUND.value(),
				HttpStatus.NOT_FOUND.getReasonPhrase(),
				ex.getMessage(),
				request.getRequestURI());
		return errResponse;
	}
	
	@ExceptionHandler(Exception.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public ErrorResponse handleOtherException(Exception ex, HttpServletRequest request) {
		
		ErrorResponse errResponse=new ErrorResponse(LocalDateTime.now(),
				HttpStatus.INTERNAL_SERVER_ERROR.value(),
				HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase(),
				ex.getMessage(),
				request.getRequestURI());
		return errResponse;
	}
		
		
	}
	
	

