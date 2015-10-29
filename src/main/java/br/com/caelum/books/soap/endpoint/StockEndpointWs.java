package br.com.caelum.books.soap.endpoint;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@Stateless
@WebService
public class StockEndpointWs {

	@Inject
	private StockItems stock;
	
	public StockEndpointWs() {
	}
	
	@WebMethod(operationName = "searchStockItem")
	@WebResult(name = "stockItem")
	public StockItem getByCode(@WebParam(name = "code") String code) {
		return stock.getByCode(code);
	}
	
}
