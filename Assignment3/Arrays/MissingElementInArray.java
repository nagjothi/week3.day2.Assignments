package week3.day2.Assignment3.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingElementInArray {
public static void main(String[] args) {
	int[] arr = {1,2,3,4,7,6,8};
	Arrays.sort(arr);
	List<Integer>number=new ArrayList<Integer>();
	number.add(1);
	number.add(2);
	number.add(3);
	number.add(4);
	number.add(6);
	number.add(7);
	number.add(8);
	System.out.println(number);

	for(int i = arr[0];i < arr.length;i++) {
	if(i!=arr[i-1]) {
		System.out.println("missing element is" + i);
	}
	}
}
}