package org.mule.modules.withings.exception;

public class WithingsRestConnectorTokenExpiredException extends Exception {
	private static final long serialVersionUID = 1L;

	public WithingsRestConnectorTokenExpiredException() {
	}

	public WithingsRestConnectorTokenExpiredException(String message) {
		super(message);
	}

	public WithingsRestConnectorTokenExpiredException(Throwable cause) {
		super(cause);
	}

	public WithingsRestConnectorTokenExpiredException(String message, Throwable cause) {
		super(message, cause);
	}
}
