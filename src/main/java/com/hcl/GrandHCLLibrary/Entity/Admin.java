package com.hcl.GrandHCLLibrary.Entity;

import javax.persistence.*;

@Entity
@Table(name = "book_details")
public class Admin {
    private int id;
	private String bookName;
    private String memberName;
    private String borrowedStatus;
    private String bookEdition;

    public Admin() {
    }
    
  

    public Admin(int id, String bookName, String memberName,String borrowedStatus,String bookEdition) {
        this.id = id;
        this.bookName = bookName;
        this.memberName = memberName;
        this.borrowedStatus = borrowedStatus;
        this.bookEdition = bookEdition;
    }
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getBorrowedStatus() {
		return borrowedStatus;
	}

	public void setBorrowedStatus(String borrowedStatus) {
		this.borrowedStatus = borrowedStatus;
	}

	public String getBookEdition() {
		return bookEdition;
	}

	public void setBookEdition(String bookEdition) {
		this.bookEdition = bookEdition;
	}


  
}
