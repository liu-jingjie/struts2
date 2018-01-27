package com.h.strutsConverter;

import java.util.Map;
import java.util.StringTokenizer;

import org.apache.struts2.util.StrutsTypeConverter;

import com.h.strutsBean.User;

public class UserConverter2 extends StrutsTypeConverter {

	@Override
	public Object convertFromString(Map context, String[] values, Class toClass) {
		
		// 从画面传到后台
		String value = values[0];		
		StringTokenizer st = new StringTokenizer(value,";");

		User user = new User();
		user.setUser(st.nextToken());
		user.setPassword(st.nextToken());
		
		return user;
	}

	@Override
	public String convertToString(Map context, Object o) {
		// 从后台传到画面
		User user = (User)o;
		String username = user.getUser();
		String password = user.getPassword();
		
		String userInfo =  "username:" + username + ", password:" + password;
		
		return userInfo;
	}

}
