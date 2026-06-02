package com.javabasic.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Defines how long annotation should be available.
@Retention(RetentionPolicy.RUNTIME)
// Defines where annotation can be used.
@Target(ElementType.METHOD)
public @interface MyAnnotation {

}
