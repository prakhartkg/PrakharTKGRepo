package org.yash.plm.exception;

public class PersonNotFoundException extends Exception {


	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;

	public PersonNotFoundException(String errMsg) {
		super(errMsg);
	}
}
