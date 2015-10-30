package br.com.caelum.books.soap.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import br.com.caelum.books.soap.exception.AuthorizationException;
import br.com.caelum.books.soap.token.Tokens;

@Stateless
@WebService(targetNamespace = "http://caelum.com.br/stockws/v1")
public class StockEndpointWs {

	@Inject
	private StockItems stock;
	
	@Inject
	private Tokens tokens;
	
	public StockEndpointWs() {
	}
	
	@WebMethod(operationName = "itemByCode")
	@WebResult(name = "stockItem")
	public StockItem getByCode(@WebParam(name = "token") String token, @WebParam(name = "code") String code) throws AuthorizationException {
		if (!tokens.isValid(token)) {
			throw new AuthorizationException("Token is invalid");
		}
		return stock.getByCode(code);
	}
	
	@WebMethod(operationName = "itemsByCode")
	@WebResult(name = "stockItems")
	public List<StockItem> getItemsByCode(@WebParam(name = "token", header = true) String token, @WebParam(name = "code") List<String> codes) throws AuthorizationTokenException {
		if (!tokens.isValid(token)) {
			throw new AuthorizationTokenException("Token is invalid");
		}
		return stock.getByListCode(codes);
	}
	
}
