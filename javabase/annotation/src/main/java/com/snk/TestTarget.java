package com.snk;

import com.snk.annotation.target.TestMethodAnnotation;
import com.snk.annotation.target.TestTypeAnnotation;

@TestTypeAnnotation
public class TestTarget {
	@TestMethodAnnotation
	public void testMethod(){
		System.out.println("TestTarget.testMethod()");
	}
}
