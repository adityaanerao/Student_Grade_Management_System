package com.aditya.student;
import com.aditya.SY.*;
import com.aditya.TY.*;

public class Student {
	int rollNo;
	String name;
	SYMARKS S1;;
	TYMarks T1;
	
	
	public Student() {
		this.rollNo = 0;
		this.name = "Null";	
		this.S1 = null;
		this.T1 = null;
	}	
	public Student(int rollNo, String name, SYMARKS s1, TYMarks t1) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		S1 = s1;
		T1 = t1;
	}
	public SYMARKS getS1() {
		return S1;
	}
	public void setS1(SYMARKS s1) {
		S1 = s1;
	}
	public TYMarks getT1() {
		return T1;
	}
	public void setT1(TYMarks t1) {
		T1 = t1;
	}
	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;		
	}	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void CalGrade() {
		int Total = S1.getComputerTotal() + T1.getPratical();
		if(Total >= 70) {
			System.out.println("You Have "+ Total + "Marks with A Grade");
		}else if(Total >= 60) {
			System.out.println("You Have "+ Total + "Marks with B Grade");			
		}else if(Total >= 50) {
			System.out.println("You Have "+ Total + "Marks with C Grade");
		}else if(Total >= 40) {
			System.out.println("You Have "+ Total + "Marks with D Grade");			
		}else {
			System.out.println("You Have " + Total + "Marks And You are Fail");
		}
		
	}
	public void display() {
		
		System.out.println("\n");
		System.out.println("Name :- "+ this.name);
		System.out.println("Roll No:-" + this.rollNo);
		CalGrade();
	}
	
	
	
	
}
