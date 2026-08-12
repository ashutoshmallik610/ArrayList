package com.student;

import java.util.ArrayList;

public class StudentDetails 
{
	public ArrayList<Student> getStudentDetails()
	{
		ArrayList<Student> list = new ArrayList();
		
		list.add(new Student("FDSDFGH", "Ashu", 70));
		list.add(new Student("KJHGFDF", "Lipu", 78));
		list.add(new Student("DFGHJJH", "Soumya", 79));
		list.add(new Student("U7RTYIU", "Dikun", 93));
		list.add(new Student("DFGHVBM", "Lulu", 81));
		list.add(new Student("IUYTRTY", "Chinu", 76));
		list.add(new Student("POLTRTY", "Dilu", 95));
		list.add(new Student("LTPOIYM", "Ranjan", 83));
		
		return list;
	
	}
	
}
