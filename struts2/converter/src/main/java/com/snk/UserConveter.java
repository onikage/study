package com.snk;

import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

public class UserConveter extends StrutsTypeConverter {

	@Override
	public Object convertFromString(Map arg0, String[] arg1, Class arg2) {
		User u = new User();
		u.setName(arg1[0].split(",")[0]);
		u.setAge(Integer.valueOf(arg1[0].split(",")[1]));
		System.out.println("convertFromString ...");
		return u;
	}

	@Override
	public String convertToString(Map arg0, Object arg1) {
		User u = (User)arg1;
		System.out.println("convertToString ...");
		return u.getName() +" "+u.getAge();
	}
	
}
