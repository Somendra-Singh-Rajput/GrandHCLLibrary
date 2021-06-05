package com.hcl.GrandHCLLibrary.Repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


import com.hcl.GrandHCLLibrary.Entity.Admin;
public interface AdminRepository extends JpaRepository<Admin, Integer> {
	
	List<Admin> findByBookName(String bookName,Pageable pageable);

	
}
