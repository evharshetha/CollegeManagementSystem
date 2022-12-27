package com.edu.CMS.Domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="admin")
public class Admin {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	private String username;
	private int pswd;
	
	public Admin() {
		
	}
	
	public Admin(Long id, String username, int pswd) {
		super();
		this.id = id;
		this.username = username;
		this.pswd = pswd;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getPswd() {
		return pswd;
	}

	public void setPswd(int pswd) {
		this.pswd = pswd;
	}

	@Override
	public String toString() {
		return "Admin [id=" + id + ", username=" + username + ", pswd=" + pswd + "]";
	}
	
	

}
