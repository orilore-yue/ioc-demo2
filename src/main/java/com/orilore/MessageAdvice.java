package com.orilore;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class MessageAdvice implements MethodBeforeAdvice{

	public void before(Method method, Object[] args, Object target) throws Throwable {
		Teacher teacher = (Teacher)args[0];
		Course course = (Course)target;
		System.out.println(teacher.getName()+"老师您好，有"+course.getName()+"课程等待您的讲解，请做好授课准备！");
	}
	
}
