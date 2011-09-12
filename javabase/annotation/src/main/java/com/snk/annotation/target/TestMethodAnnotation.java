package com.snk.annotation.target;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
public @interface TestMethodAnnotation {
	String name = "TestMethodAnnotation";
	String testStr = "testStrValue";
}
