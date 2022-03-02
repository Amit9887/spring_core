package com.amit.demo_bean.ci;

public class student {
	
	private int s_id;
	private String s_name;
	private int s_age;
	public student(int s_id, String s_name, int s_age) {
		super();
		this.s_id = s_id;
		this.s_name = s_name;
		this.s_age = s_age;
	}
	@Override
	public String toString() {
		return "student [s_id=" + s_id + ", s_name=" + s_name + ", s_age=" + s_age + "]";
	}
	
	
	

}
