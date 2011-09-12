package com.snk.annotation.retention;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface TestRunTimeAnnotation {
	String value = "TestRunTimeAnnotation";
}
