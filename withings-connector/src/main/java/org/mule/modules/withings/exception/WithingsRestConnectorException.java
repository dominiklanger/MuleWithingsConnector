package org.mule.modules.withings.exception;

public class WithingsRestConnectorException extends Exception {
	private static final long serialVersionUID = 1L;

	public WithingsRestConnectorException() {
	}

	public WithingsRestConnectorException(String message) {
		super(message);
	}

	public WithingsRestConnectorException(Throwable cause) {
		super(cause);
	}

	public WithingsRestConnectorException(String message, Throwable cause) {
		super(message, cause);
	}
}
