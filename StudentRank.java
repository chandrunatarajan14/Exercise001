package com.student.demo;


public class StudentRank {
	private int StudentId;
	private  String StudentName;
	private String S_Address;
	private  int StudentMark;
	private int StudentRank;
	
	
	public StudentRank() 
	{
		//default constructor
	}
	
	//The parameterized constructor
	public StudentRank(int studentId, String studentName, String s_Address, int studentMark, int studentRank)
	{
		super();                       
		this.StudentId = studentId;
		this.StudentName = studentName;
		this.S_Address = s_Address;
		this.StudentMark = studentMark;
		this.StudentRank = studentRank;
	}

       // To write getters and setter for all fields
   

		public int getStudentId()	{
			return StudentId;
		}
		public void setStudentId(int studentId)
		{
			StudentId = studentId;
		}
		public String getStudentName() {
			return StudentName;
		}
		public void setStudentName(String studentName) {
			StudentName = studentName;
		}
		public int getStudentMark() {
			return StudentMark;
		}
		public void setStudentMark(int studentMark) {
			StudentMark = studentMark;
		}
		public int getStudentRank() {
			return StudentRank;
		}
		public void setStudentRank(int studentRank) {
			StudentRank = studentRank;
			
		}

  //Override the method
		@Override
		public String toString() {
			return "StudentRank [StudentId=" + StudentId +" || StudentName=" + StudentName + " || S_Address= " + S_Address+ " || StudentMark=" + StudentMark + " ||StudentRank=" + StudentRank + "]";
		 }


		

		
		
		
		
	
}
