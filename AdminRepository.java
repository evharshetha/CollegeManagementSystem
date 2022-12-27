package com.edu.CMS.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.CMS.Domain.Admin;


public interface AdminRepository extends JpaRepository<Admin, Long> {

}
