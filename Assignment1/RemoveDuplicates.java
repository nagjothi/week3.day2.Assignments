package week3.day2.Assignment1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
public static void main(String[] args) {
	String text = "we learn java basics as a part of java sessions in java week";
	String[] split = text.split(" ");
Set<String>names=new LinkedHashSet<String>();
for(int i = 0;i < split.length;i++) {
	names.add(split[i]);
	System.out.println(names);
}
}
}