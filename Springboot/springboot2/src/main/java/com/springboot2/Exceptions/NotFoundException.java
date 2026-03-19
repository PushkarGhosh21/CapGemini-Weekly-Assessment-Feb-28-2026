package com.springboot2.Exceptions;
public class NotFoundException extends RuntimeException{
	public NotFoundException(String msg) {
		super(msg);
	}
}
