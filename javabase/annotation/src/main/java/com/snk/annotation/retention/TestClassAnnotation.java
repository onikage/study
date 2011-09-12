package com.snk.annotation.retention;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.CLASS)
public @interface TestClassAnnotation {
	String value = "TestClassAnnotation";
}
