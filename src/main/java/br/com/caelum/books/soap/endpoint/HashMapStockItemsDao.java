package br.com.caelum.books.soap.endpoint;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.ejb.Stateless;

@Stateless
public class HashMapStockItemsDao implements StockItems {

	private HashMap<String, StockItem> itens = new HashMap<String, StockItem>();
	
	public HashMapStockItemsDao() {
		itens.put("ARQ", new StockItem("ARQ", 10, 1));
		itens.put("REST", new StockItem("REST", 12, 1));
		itens.put("SOA", new StockItem("SOA", 8, 1));
		itens.put("JSF", new StockItem("JSF", 15, 1));
		itens.put("TDD", new StockItem("TDD", 7, 1));
	}

	@Override
	public StockItem getByCode(String code) {
		return itens.get(code);
	}

	@Override
	public List<StockItem> getByListCode(List<String> codes) {
		List<StockItem> items = new ArrayList<StockItem>();
		for (String code : codes) {
			items.add(itens.get(code));
		}
		return items;
	}
	
}
