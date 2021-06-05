package com.hcl.GrandHCLLibrary.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.hcl.GrandHCLLibrary.Entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
