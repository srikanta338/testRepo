package com.arrayClass;

import java.util.HashSet;


public class UniqueElement1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr= {1,1,1,2,2,2,3,5,4,5,6,7,3,2};
		HashSet<Integer> set=new HashSet<Integer>();
		for(Integer i:arr) {
			if(set.add(i)) {
			System.out.println(i);
			}
			
		}
		

	}

}
