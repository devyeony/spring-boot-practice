package com.example.demo.dto;

public class Member {
	private int no;
	private String name;
	
	public Member() {}
	public Member(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Member [no=" + no + ", name=" + name + ", getNo()=" + getNo() + ", getName()=" + getName()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
}
