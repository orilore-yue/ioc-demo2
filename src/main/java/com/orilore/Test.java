package com.orilore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Computer cpu = context.getBean(Computer.class);
		System.out.println(cpu.getSize());
		Emp emp = cpu.getEmp();
		System.out.println(emp.getName());
	}
}
