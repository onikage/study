package com.snk;

import java.lang.reflect.Method;

import com.snk.annotation.inherited.InheriteSub;

public class Test {
	public static void main(String[] args) {
		//TestRetention
		Class<TestRetention> tr = TestRetention.class;
		Method[] methods = tr.getMethods();
		System.out.println(methods[0].getAnnotations().length);
		System.out.println(methods[1].getAnnotations()[0]);
		
		//TestInherited
		Class<InheriteSub> is = InheriteSub.class;
		System.out.println(is.getAnnotations()[0]);
	}
}
