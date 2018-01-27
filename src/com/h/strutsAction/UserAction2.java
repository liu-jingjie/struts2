package com.h.strutsAction;

import java.util.List;

import com.h.strutsBean.User;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction2 extends ActionSupport {

	@Override
	public String execute() throws Exception {
		
		for(User u : user) {
			System.out.println(u.getUser() + "," + u.getPassword());	
		}
		
		// TODO Auto-generated method stub
		return SUCCESS;
	}

	private List<User> user;

	public List<User> getUser() {
		return user;
	}

	public void setUser(List<User> user) {
		this.user = user;
	}
	
	
	
}
