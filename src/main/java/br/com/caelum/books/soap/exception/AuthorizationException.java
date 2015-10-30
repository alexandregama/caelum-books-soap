package br.com.caelum.books.soap.exception;

import javax.xml.ws.WebFault;

@WebFault(name = "AuthorizationException")
public class AuthorizationException extends RuntimeException {

	private static final long serialVersionUID = -1408535002709343604L;

	public AuthorizationException(String message) {
		super(message);
	}
	
}
