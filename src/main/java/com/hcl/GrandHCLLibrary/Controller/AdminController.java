package com.hcl.GrandHCLLibrary.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.hcl.GrandHCLLibrary.Entity.Admin;
import com.hcl.GrandHCLLibrary.Service.AdminService;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    AdminService adminService;

    @GetMapping("")
    public List<Admin> list() {
        return adminService.listAllUser();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Admin> get(@PathVariable Integer id) {
        try {
            Admin admin = adminService.getUser(id);
            return new ResponseEntity<Admin>(admin, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Admin>(HttpStatus.NOT_FOUND);
        }
    }
    
    
    @GetMapping("/bookname/{bookName}")
    public ResponseEntity<List<Admin>> get(@PathVariable String bookName) {
        try {
            List<Admin> admin = adminService.getUserDetails(bookName);
            return new ResponseEntity<List<Admin>>(admin, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<List<Admin>>(HttpStatus.NOT_FOUND);
        }
    }
    
    @PostMapping("/")
    public void add(@RequestBody Admin admin) {
    	adminService.saveUser(admin);
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody Admin user, @PathVariable Integer id) {
        try {
            Admin existUser = adminService.getUser(id);
            user.setId(id);
            adminService.saveUser(user);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

  
}
