package week3.day2.Assignment3.Arrays;

import java.util.ArrayList;
import java.util.List;

public class PrintDuplicates {
	public static void main(String[] args) {
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		List<Integer>list=new ArrayList<Integer>();
		for(int i = 0;i < arr.length;i++) {
			list.add(arr[i]);
			for(int j = i+1;j < arr.length;j++) {
				if(arr[i] == arr[j]) {
					System.out.println(arr[j]);
				}
			}
			
		}
	}
}