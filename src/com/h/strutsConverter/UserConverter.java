package com.h.strutsConverter;

import java.util.Map;
import java.util.StringTokenizer;

import com.h.strutsBean.User;

import ognl.DefaultTypeConverter;

public class UserConverter extends DefaultTypeConverter {

	@Override
	public Object convertValue(Map context, Object value, Class toType) {
		
		// 从画面传到后台
		if(User.class == toType) {
			
			String[] str = (String[])value;
			String firstValue = str[0];
			
			StringTokenizer st = new StringTokenizer(firstValue,";");
			
			User user = new User();
			user.setUser(st.nextToken());
			user.setPassword(st.nextToken());
			
			return user;
			
		// 从后台传到画面
		}else if(String.class == toType) {
			User user = (User)value;
			
			String username = user.getUser();
			String password = user.getPassword();
			
			String userInfo =  "username:" + username + ", password:" + password;
			
			return userInfo;
		}
		
		return "";
	}
}
