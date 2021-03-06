package com.superbowldb.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ControllerAdvice
public class SuperbowlNotFoundAdvice {
	@ResponseBody
	@ExceptionHandler(SuperbowlNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	String superbowlNotFoundHandler(SuperbowlNotFoundException ex) {
		return ex.getMessage();
	}

}
