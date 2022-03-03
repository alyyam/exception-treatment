package model.exceptions;

import javax.management.relation.RoleUnresolved;

public class DomainException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public DomainException(String msg) { // permite que a classe seja iniciada passando uma msg 
		super(msg);
	}

}
