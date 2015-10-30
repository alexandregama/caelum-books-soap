package br.com.caelum.books.soap.endpoint;

import javax.xml.ws.WebFault;

// Exception needs to be checked to shows as detail in soap message
@WebFault(name = "TokenAuthorization")
public class AuthorizationTokenException extends Exception {

	private static final long serialVersionUID = -3201337662847609144L;

	public AuthorizationTokenException(String message) {
		super(message);
	}
}
