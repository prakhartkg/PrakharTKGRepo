package org.yash.plm.exception;

public class BookNotFoundException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BookNotFoundException(String errMsg) {
		super(errMsg);
	}

}
