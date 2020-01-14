package com.orilore;

public class Course implements ICourse{
	private String name;
	
	public void process(Teacher teacher) {
		System.out.println(teacher.getName()+"正在讲授"+this.name+"课程...");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
