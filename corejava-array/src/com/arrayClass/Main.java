package com.arrayClass;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                 System.out.println("get started..");
		int ar[] = {4, 6, 1, 8, 3, 9, 7, 4, 2};
		//to print element in one line
		System.out.println(Arrays.toString(ar));//[4, 6, 1, 8, 3, 9, 7, 4, 2]
		System.out.println(ar);//[I@52e922
		//sorting specific range of an array in ascending order
		Arrays.sort(ar, 0, 4);
		System.out.println(Arrays.toString(ar));//[1, 4, 6, 8, 3, 9, 7, 4, 2]
		 //sorting total array
		Arrays.sort(ar);
		System.out.println(Arrays.toString(ar));//[1, 2, 3, 4, 4, 6, 7, 8, 9]
		
		// binary Searching an element in array..
		//first to do sorting , after that searching
		int index=Arrays.binarySearch(ar, 8);
		System.out.println(index);//7
		
		//copy of whole array and some specific range of array..
		
		int[] arr1=Arrays.copyOf(ar, ar.length);
		System.out.println(arr1);//[I@25154f
		System.out.println(Arrays.toString(arr1));//[1, 2, 3, 4, 4, 6, 7, 8, 9]
		
		int[] arr2=Arrays.copyOfRange(arr1, 2, 5);
		System.out.println(Arrays.toString(arr2));
		
		//fill sub array or complete array with values
		
		Arrays.fill(arr1, 0, 3, 1);
		System.out.println(Arrays.toString(arr1));//[1, 1, 1, 4, 4, 6, 7, 8, 9]
		
		Arrays.fill(arr2, 10);
		System.out.println(Arrays.toString(arr2));
		
		//list representation...
		Integer arr3[] = {4, 6, 1, 8, 3, 9, 7, 4, 2};
		List<Integer>l= Arrays.asList(arr3);
		System.out.println(l);//[4, 6, 1, 8, 3, 9, 7, 4, 2]
		
		
		

	}

}
