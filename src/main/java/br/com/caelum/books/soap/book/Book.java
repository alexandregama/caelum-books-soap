package br.com.caelum.books.soap.book;

import java.io.Serializable;

public class Book implements Serializable {

	private static final long serialVersionUID = 2483131418752192798L;

	private Long id;

	private String code;

	private String name;

	@Deprecated
	// JAX-B constructor
	public Book() {
	}

	public Book(Long id, String code, String name) {
		this.id = id;
		this.code = code;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", code=" + code + ", name=" + name + "]";
	}

}
