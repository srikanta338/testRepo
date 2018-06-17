package com.arrayClass;

import java.util.Arrays;

class Student{
	int roll;
	String name;
	String add;
	
	public Student(int roll, String name, String add) {
		this.roll=roll;
		this.name=name;
		this.add=add;
	}
	
	public String toString() {
		return this.roll+ " "+this.name+ " "+ this.add;
	}
	
}

public class ObjectReopresentaion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] arr= {new Student(111, "srk", "ctc"),
				        new Student(222, "gmm", "abc"),
				        new Student(333, "sss", "rrr"),
				       };
		System.out.println(Arrays.toString(arr));

	}

}
