package com.alf.AnnotationExample;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author yinga
 * 成员类型受限，合法的类型包括原始类型以及String,Class,Annotation,Enumeration.
 * 如果注解只有一个成员，则成员名必须取名为value(),在使用时可以忽略成员名和赋值号（=）
 * 注解类可以没有成员，没有成员的注解成为标示注解
 */
@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface CustomizedAnnotation {
	String desc();
	String author();
	double version() default 1.0; 
}