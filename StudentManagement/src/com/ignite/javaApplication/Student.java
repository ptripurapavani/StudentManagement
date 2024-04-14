package com.ignite.javaApplication;

public class Student {
	String name;
	int study;
	int contactNumber;
	public Student() {
		super();
	}
	public Student(String name, int study, int contactNumber) {
		super();
		this.name = name;
		this.study = study;
		this.contactNumber = contactNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStudy() {
		return study;
	}
	public void setStudy(int study) {
		this.study = study;
	}
	public int getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", study=" + study + ", contactNumber=" + contactNumber + "]";
	}
	

}
