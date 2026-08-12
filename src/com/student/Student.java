package com.student;

public class Student 
{
	private String studentId;
	private String studentName;
	private int marks;
	
	public Student(String studentId, String studentName, int marks) 
	{
		setStudentId(studentId);
		this.studentName=studentName;
		setMarks(marks);
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) 
	{	
		if(studentId==null || studentId.isEmpty())
		{
			System.out.println("Invalid id");
			this.studentId=null;
		}
		else
		{	
			this.studentId = studentId;
		}
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) 
	{
		this.studentName = studentName;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) 
	{	
		if(marks>0)
		{
			this.marks = marks;
		}
		else
		{
			System.out.println("Invalid mark");
			this.marks=0;
		}
	}
	
	public void showDetails()
	{
		System.out.println("-----------------------");
		System.out.println("Student Id : "+getStudentId());
		System.out.println("Name : "+getStudentName());
		System.out.println("Marks : "+getMarks());
	}
	
}
