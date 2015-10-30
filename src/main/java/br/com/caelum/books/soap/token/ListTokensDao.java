package br.com.caelum.books.soap.token;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

@Stateless
public class ListTokensDao implements Tokens {

	private List<String> tokens = new ArrayList<>();
	
	public ListTokensDao() {
		tokens.add("AAA");
		tokens.add("BBB");
		tokens.add("CCC");
		tokens.add("DDD");
	}
	
	@Override
	public boolean isValid(String token) {
		for (String t : tokens) {
			if (token.equals(t)) {
				return true;
			}
		}
		return false;
	}

}
