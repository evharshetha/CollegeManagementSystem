package com.edu.CMS.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.CMS.Domain.Admin;
import com.edu.CMS.Repository.AdminRepository;




@Service
public class AdminService {
	@Autowired
    private AdminRepository repo;
	
	public List<Admin> listAll() {
        return repo.findAll();
    }
    
    public void save(Admin admin) {
        repo.save(admin);
    }
    
    public Admin get(long id) {
        return repo.findById(id).get();
    }
    
    public void delete(long id) {
        repo.deleteById(id);
    }

}
