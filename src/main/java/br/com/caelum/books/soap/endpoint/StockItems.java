package br.com.caelum.books.soap.endpoint;

import java.util.List;

public interface StockItems {

	StockItem getByCode(String code);

	List<StockItem> getByListCode(List<String> codes);
	
}
