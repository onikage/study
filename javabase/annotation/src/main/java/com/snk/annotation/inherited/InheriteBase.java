package com.snk.annotation.inherited;

@TestInheritedAnnotation
public class InheriteBase {
	
	@TestInheritedAnnotation
	public void method(){
		System.out.println("InheriteBase.method()");
	}
}
