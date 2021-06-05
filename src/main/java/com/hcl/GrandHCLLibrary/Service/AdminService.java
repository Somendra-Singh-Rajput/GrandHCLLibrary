package com.hcl.GrandHCLLibrary.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.hcl.GrandHCLLibrary.Service.AdminService;
import com.hcl.GrandHCLLibrary.Entity.Admin;
import com.hcl.GrandHCLLibrary.Repository.AdminRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class AdminService {
	
    @Autowired
    private AdminRepository adminRepository;
    
    public List<Admin> listAllUser() {
        return adminRepository.findAll();
    }

    public void saveUser(Admin user) {
        adminRepository.save(user);
    }

    public Admin getUser(Integer id) {
        return adminRepository.findById(id).get();
    }

    public List<Admin> getUserDetails(String name) {
    	Pageable pageable = PageRequest.of(0, 1);  // For optimization if large no.of records
        return adminRepository.findByBookName(name,pageable);
    }
    
}
