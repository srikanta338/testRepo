package com.arrayClass;

public class UniqueElement {
	static void unq(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]!=arr[j]) {
					System.out.println(arr[i]);
					break;
				}
				
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,1,2};
		unq(arr);

	}

}
