
package com.sdong.spring.exception.demo.exception;



public class ParameterException extends RuntimeException {


	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 7229111758279142422L;

	public ParameterException() {
		super();
	}

	public ParameterException(String message) {
		super(message);
	}

	public ParameterException(Throwable cause) {
		super(cause);
	}

	public ParameterException(String message, Throwable cause) {
		super(message, cause);
	}
}
