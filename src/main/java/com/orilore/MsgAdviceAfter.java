package com.orilore;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class MsgAdviceAfter implements AfterReturningAdvice{

	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("课程已结束，请及时关闭电教设备！");
	}

}
