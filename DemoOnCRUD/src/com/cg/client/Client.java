package com.cg.client;

import com.cg.entity.Student;
import com.cg.service.StudentService;
import com.cg.service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {
		
		StudentService service = new StudentServiceImpl();
		
		Student student = new Student();
		
		//Create Operation
		student.setStudentid(10);
		student.setName("Meera");
		service.addStudent(student);
		
		//at this breakpoint we have added one record to table
		//Retrieve Operation
//		student = service.findStudentById(10);
//		System.out.println("ID:"+student.getStudentid());
//		System.out.println("Name:" +student.getName());
		
//		Update Operation
//		student = service.findStudentById(10);
//		student.setName("Meera Rathod");
//		service.updateStudent(student);
		
		//at this breakpoint we have updated record added in first section
//		student = service.findStudentById(10);
//		System.out.print("ID:"+student.getStudentid());
//		System.out.println("Name:"+student.getName());
		
		//at this breakpoint record is removed from table
		//Delete Operation
//		student = service.findStudentById(10);
//		service.removeStudent(student);
		
		System.out.println("End of Program/Life Cycle Completed.....");

	}

}
