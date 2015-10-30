package br.com.caelum.books.soap.book;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

@Stateless
public class ListBooksDao implements Books {

	private List<Book> books = new ArrayList<>();

	public ListBooksDao() {
		books.add(new Book(1l, "SOA", "Service Oriented Architecture"));
		books.add(new Book(2l, "REST", "RESTful WebServices"));
		books.add(new Book(2l, "TDD", "Test Driven Development"));
	}

	@Override
	public Book getByCode(String code) {
		for (Book book : books) {
			if (book.getCode().equals(code)) {
				return book;
			}
		}
		return null;
	}

}
