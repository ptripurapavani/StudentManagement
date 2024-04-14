package com.ignite.javaApplication;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class StudentOperations {
	Map<Integer,Student> studentMap=new HashMap<>();
	String registerStudent(Student std) {
		studentMap.put(std.contactNumber, std);
		System.out.println(studentMap);
		return "student registered successfully";
	}
	Collection<Student> listStudents(){
		return studentMap.values();
	}
	String update(int existNumber,int updateNumber) {
		Student findStudent=studentMap.get(existNumber);
		findStudent.setContactNumber(updateNumber);
		
		studentMap.remove(existNumber);
		studentMap.put(updateNumber, findStudent);
		
		return "updated number successfully";
	}
	String delete(int number) {
		studentMap.remove(number);
		return "deleted successfully";
	}

}
