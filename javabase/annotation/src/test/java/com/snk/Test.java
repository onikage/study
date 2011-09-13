package com.snk;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.snk.annotation.inherited.InheriteSub;
import com.snk.annotation.inherited.TestInheritedAnnotation;
import com.snk.annotation.target.TestMethodAnnotation;

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
		
		methods = InheriteSub.class.getMethods();
		for (int i = 0; i < methods.length; i++) {
			Method m = methods[i];
			if(null != m.getAnnotation(TestInheritedAnnotation.class)){
				System.out.print(m.getName()+"   ");
				System.out.println(m.getAnnotation(TestInheritedAnnotation.class));
				try {
					m.invoke(new InheriteSub(), new Object[]{});
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
		
		//get method by annotation
		methods = TestTarget.class.getMethods();
		for (int i = 0; i < methods.length; i++) {
			Method m = methods[i];
			if(null != m.getAnnotation(TestMethodAnnotation.class)){
				System.out.print(m.getName()+"   ");
				System.out.println(m.getAnnotation(TestMethodAnnotation.class));
				
				try {
					m.invoke(new TestTarget(), new Object[]{});
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
