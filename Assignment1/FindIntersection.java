package week3.day2.Assignment1;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {
public static void main(String[] args) {
	int[] arr1 = {3,2,11,4,6,7};
	int[] arr2 = {1,2,8,4,9,7};
	List<Integer>list1=new ArrayList<Integer>();
	List<Integer>list2=new ArrayList<Integer>();
	for(int i = 0;i < arr1.length;i++) {
		list1.add(arr1[i]);
		for(int j = 0;j < arr2.length;j++) {
			list2.add(arr2[j]);
		if(arr1[i] == arr2[j]) {
			System.out.println(arr2[j]);	
			}
		}
	}

}
}
