package zoho_int_que;

import java.util.Scanner;

public class Find_index_of_substring {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the 1st string");
	String s1=sc.next();
	System.out.println("enter the 2nd string");
	String s2=sc.next();
	if(s1.contains(s2))
	{
		System.out.print(s1.indexOf(s2));
	}
	else {
		System.out.println("-1");
	}
}
}
