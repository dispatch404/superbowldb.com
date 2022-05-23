package com.superbowldb.exception;

public class SuperbowlNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public SuperbowlNotFoundException(int id){
		super("Superbowl data not available for " + id);
	}
}
