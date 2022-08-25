package com.student.demo;

public class StudentTest {
	
	public static void main(String args[]) {
		int r1,r2,r3,r4,r5;
		 //To create object 
		
		StudentRank SR=new StudentRank(101,"Arun", "Bharathi Nagar 4th cross stret",430,3);
		StudentRank SR1=new StudentRank(102,"charan","2/13 MGR Nagar",450,2);
		StudentRank SR2=new StudentRank(103,"vikram","3/1133 Solaima Nagar 2nd street",460,1);
		StudentRank SR3=new StudentRank(104,"siva","2/45 venkat Nagar" ,398,4);
		StudentRank SR4=new StudentRank(105,"kumar","Shollinganallur ",350,5);
	
		System.out.println(SR.toString());
		System.out.println();
		System.out.println(SR1.toString());
		System.out.println();
        System.out.println(SR2.toString());
        System.out.println();
		System.out.println(SR3.toString());
		System.out.println();
		System.out.println(SR4.toString());
		System.out.println("**********************************************");
		
		
		System.out.println(r1=SR.getStudentRank());
		System.out.println(r2=SR1.getStudentRank());
		System.out.println(r3=SR2.getStudentRank());
		System.out.println(r4=SR3.getStudentRank());
		System.out.println(r5=SR4.getStudentRank());
		System.out.println("**********************************************");
		
		if(r1==1)      {System.out.println("First Rank Student :" +SR.getStudentName());}
		else if(r2==1) {System.out.println("First Rank Student :" +SR1.getStudentName());}
		else if(r3==1) {System.out.println("First Rank Student :" +SR2.getStudentName());}
		else if(r4==1) {System.out.println("First Rank Student :" +SR3.getStudentName());}
		else if(r5==5) {System.out.println("First Rank Student :" +SR3.getStudentName());}
			
		System.out.println("***********************************************");
		
	
		if(r1==5)      {System.out.println("Last Rank Student :" +SR.getStudentName());}
		else if(r2==5) {System.out.println("Last Rank Student :" +SR1.getStudentName());}
		else if(r3==5) {System.out.println("Last Rank Student :" +SR2.getStudentName());}
		else if(r4==5) {System.out.println("Last Rank Student :" +SR3.getStudentName());}
		else if(r5==5) {System.out.println("Last Rank Student :" +SR4.getStudentName());}
		else {System.out.println("Not mached");}
			
		
	}
	 
	}

	

