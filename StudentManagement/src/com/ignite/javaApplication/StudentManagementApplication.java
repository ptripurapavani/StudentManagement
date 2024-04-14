package com.ignite.javaApplication;
import java.util.*;
public class StudentManagementApplication {
	static StudentOperations studentCRUD =new StudentOperations();
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("please choose the option (1-create 2-retrive 3-update 4-delete 0-exit");
		int userSelection=scan.nextByte();
		performAction(userSelection,scan );
		
	}

	private static void performAction(int userSelection, Scanner scan) {
		switch(userSelection) {
		case 0:{System.out.println("Terminate the application");
		System.exit(0);
		break;
		}
		case 1:{System.out.println("Register a student");
		System.out.println("enter name");
		String name=scan.next();
		
		System.out.println("enter standard");
		int standard=scan.nextInt();
		
		System.out.println("enter number");
		int number=scan.nextInt();
		Student std=new Student(name,standard,number );
		
		String response=studentCRUD.registerStudent(std);
		System.out.println(response);
		
		System.out.println("please choose the option (1-create 2-retrive 3-update 4-delete 0-exit");
		int nextSelection=scan.nextByte();
		performAction(nextSelection,scan );
		break;
		}
		case 2:{System.out.println("retrive a student");
		Collection<Student> students=studentCRUD.listStudents();
		for (Student student : students) {
			System.out.println(student.getName()+" "+"contact number("+student.getContactNumber()+")");
			
		}
		System.out.println("please choose the option (1-create 2-retrive 3-update 4-delete 0-exit");
		int nextSelection=scan.nextByte();
		performAction(nextSelection,scan );
		break;
		}
		case 3:{System.out.println("update a student");
		System.out.println("provide student input number");
		int inputNumber=scan.nextInt();
		System.out.println("provide student number to update");
		int updatedNumber=scan.nextInt();
		String status=studentCRUD.update(inputNumber,updatedNumber);
		System.out.println("please choose the option (1-create 2-retrive 3-update 4-delete 0-exit");
		int nextSelection=scan.nextByte();
		performAction(nextSelection,scan );
		break;
		}
		case 4:{System.out.println("Delete a student");
		System.out.println("provide student number to delete");
		int inputNumber=scan.nextInt();
		studentCRUD.delete(inputNumber);
		
		System.out.println("please choose the option (1-create 2-retrive 3-update 4-delete 0-exit");
		int nextSelection=scan.nextByte();
		performAction(nextSelection,scan );
		break;
		}
		default:
			throw new IllegalArgumentException("unexcepted value"+userSelection);
		}
		
		
	}
	

}
