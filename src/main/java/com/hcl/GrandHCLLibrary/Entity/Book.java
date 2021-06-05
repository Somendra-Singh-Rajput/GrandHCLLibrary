package com.hcl.GrandHCLLibrary.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long uuid;
	private String title;
	private String author;
	private String edition;
	
	public Book(long uuid, String title, String author, String edition) {
		super();
		this.uuid = uuid;
		this.title = title;
		this.author = author;
		this.edition = edition;
	}

	public long getUuid() {
		return uuid;
	}

	public void setUuid(long uuid) {
		this.uuid = uuid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getEdition() {
		return edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

	@Override
	public String toString() {
		return "Book [uuid=" + uuid + ", title=" + title + ", author=" + author + ", edition=" + edition + "]";
	}
}
