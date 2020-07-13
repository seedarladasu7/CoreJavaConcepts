package com.concepts.core.java.arrays.operations;

import java.util.Arrays;

public class ReverseArrayElements {

	public static void main(String[] args) {
		ReverseArrayElements obj = new ReverseArrayElements();
		int[] arr = {10,100,20,30,0, 40,50,60,200};
		System.out.println("Actual array: "+Arrays.toString(arr));
		int len = arr.length;
		obj.withMulArray(arr, len);
		obj.withoutMulArray(arr, len);
	}
	
	private void withMulArray(int[] arr, int len) {
		int[] revArr = new int[len];
		int maxArrIndex = len-1;
		for(int i = 0; i < len; i++) {
			revArr[maxArrIndex] = arr[i];
			maxArrIndex--;
		}
		System.out.println("Reverse array(withMulArray)   : "+Arrays.toString(revArr));
	}
	
	private void withoutMulArray(int[] arr, int len) {
		int maxArrIndex = len-1;
		int midLen = len/2;
		for(int i = 0; i < midLen; i++) {
			int maxButOneIndex = maxArrIndex-i; 
			int temp = arr[i];
			arr[i] = arr[maxButOneIndex];
			arr[maxButOneIndex] = temp;
		}
		System.out.println("Reverse array(withoutMulArray): "+Arrays.toString(arr));
	}

}
