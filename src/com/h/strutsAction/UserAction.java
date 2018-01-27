package com.h.strutsAction;

import com.h.strutsBean.User;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String execute() throws Exception {

		System.out.println("user:" + user.getUser() + " password:" + user.getPassword());
		
		return SUCCESS;
	}
}
