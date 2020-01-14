package com.orilore;

import java.util.Map;
import java.util.Properties;

public class Emp {
	private int id;
	private String code;
	private String name;
	private char sex;
	private float wage;
	
	private Map<String,String> phones;
	private Properties prop;
	
	public void destory() {
		System.out.println("我被销毁了！");
	}
	
	public void init() {
		System.out.println("我长大了！");
	}
	
	public Emp(int id,String code) {
		System.out.println("我出生了！");
		this.id = id;
		this.code = code;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public float getWage() {
		return wage;
	}
	public void setWage(float wage) {
		this.wage = wage;
	}

	public Map<String,String> getPhones() {
		return phones;
	}

	public void setPhones(Map<String,String> phones) {
		this.phones = phones;
	}

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}


	
}
