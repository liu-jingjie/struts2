package com.h.strutsAction;

import com.h.hib.dao.CreateStudentDemo2;

public class LoginAction {
	
	private String username;
	private String password;
	private String email;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String execute() {
		CreateStudentDemo2 csd = new CreateStudentDemo2();
		csd.saveInfo(username, password, email);
		
		return "success";
	}
}