package com.snk.annotation.target;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TestMethodAnnotation {
	String name = "TestMethodAnnotation";
	String testStr = "testStrValue";
}
