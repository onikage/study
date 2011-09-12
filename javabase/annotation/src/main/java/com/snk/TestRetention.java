package com.snk;

import com.snk.annotation.retention.TestClassAnnotation;
import com.snk.annotation.retention.TestRunTimeAnnotation;

public class TestRetention {
	@TestClassAnnotation
	public void testClassMethod(){
		System.out.println("TestTarget.testClassMethod()");
	}
	
	@TestRunTimeAnnotation
	public void testRunTimeMethod(){
		System.out.println("TestTarget.testRunTimeMethod()");
	}
}
