package com.mini.project.exception;

public class ApplicationException extends Exception{
	
	String msg;
	public ApplicationException(String msg) {
		this.msg = msg;
	}
	@Override
	public String getMessage() {
		return this.msg;
	}
}
