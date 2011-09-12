package com.snk.annotation.target;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
public @interface TestTypeAnnotation {
	String value() default "TestTypeAnnotation";
}
