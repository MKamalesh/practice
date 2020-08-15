package zoho_int_que;

import java.util.Scanner;

public class String_rev_using_recursion {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the no. of words");
	int n=sc.nextInt();
	String s="";
	while(n>0)
	{
		String s1=sc.next();
		s=s+s1+" ";
		n--;
	}
	System.out.println(s);
	String str[]=s.split(" ");
	for(int i=str.length-1;i>=0;i--)
	{
		System.out.print(str[i]+" ");
	}
}
}
