package com.hcl.CustomExceptions;

public class UserNotFound extends Exception {

		public UserNotFound(String message,Throwable e) {
			super(message,e);
		}
	
	
}
