package com.student;

import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		
		StudentDetails studentDetails = new StudentDetails();
		
		ArrayList<Student> students =studentDetails.getStudentDetails();
		
		for(Student s : students)
		{
			if(s.getMarks()>80)
			{
				s.showDetails();
			}
		}
	}

}
