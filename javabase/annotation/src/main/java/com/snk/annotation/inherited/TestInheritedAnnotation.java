package com.snk.annotation.inherited;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface TestInheritedAnnotation {
	String value = "TestInheritedAnnotation";
}
