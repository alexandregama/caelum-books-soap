package br.com.caelum.books.soap.endpoint;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import br.com.caelum.books.soap.book.Book;
import br.com.caelum.books.soap.book.Books;

@Stateless
@WebService
@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL, parameterStyle = ParameterStyle.WRAPPED)
public class BookEndpointWS {

	@Inject
	private Books books;
	
	@WebMethod(operationName = "bookByCode")
	@WebResult(name = "bookFound")
	public Book getBookByCode(@WebParam(name = "code") String code) {
		Book book = books.getByCode(code);
		System.out.println("Book found: " + book);
		
		return book;
	}
	
}
