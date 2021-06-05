package com.hcl.GrandHCLLibrary.Entity;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="books")
public class Book {
	
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "uuid", columnDefinition = "VARCHAR(255)")
	private UUID uuid;
	private long rackNo;
	private String title;
	private String author;
	private String edition;
	
	public Book(UUID uuid, long rackNo, String title, String author, String edition) {
		super();
		this.uuid = uuid;
		this.rackNo = rackNo;
		this.title = title;
		this.author = author;
		this.edition = edition;
	}
	
	public Book() {
		super();
	}
	
	public UUID getUuid() {
		return uuid;
	}
	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}
	public long getRackNo() {
		return rackNo;
	}
	public void setRackNo(long rackNo) {
		this.rackNo = rackNo;
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
		return "Book [uuid=" + uuid + ", rackNo=" + rackNo + ", title=" + title + ", author=" + author + ", edition="
				+ edition + "]";
	}	
}
