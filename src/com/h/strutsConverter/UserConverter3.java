package com.h.strutsConverter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import org.apache.struts2.util.StrutsTypeConverter;

import com.h.strutsBean.User;

public class UserConverter3 extends StrutsTypeConverter {

	@SuppressWarnings("rawtypes")
	@Override
	public Object convertFromString(Map context, String[] values, Class toClass) {
		
		List<User> list = new ArrayList<User>();
		
		for(String value : values) {
			StringTokenizer st = new StringTokenizer(value, ";");
			
			User user = new User();
			user.setUser(st.nextToken());
			user.setPassword(st.nextToken());
			
			list.add(user);
		}
		
		return list;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public String convertToString(Map context, Object o) {
		
		@SuppressWarnings("unchecked")
		List<User> list = (List<User>)o;
		
		StringBuffer buffer = new StringBuffer();
		
		for(User u : list) {

			String username = u.getUser();
			String password = u.getPassword();
			
			buffer.append("username:")
				  .append(username)
				  .append(" password:")
				  .append(password)
				  .append(";  ");
		}
		
		return buffer.toString();
	}
}
