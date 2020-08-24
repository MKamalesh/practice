package zoho_int_que;

import java.util.Scanner;

public class Longest_seq_bw_two_char {
public static void main(String[] args) {
	System.out.println("enter the string");
	Scanner sc=new Scanner(System.in);
	String str=sc.next();
	int mcount=-1;
	for(int i=0;i<str.length()-1;i++)
	{
		int j=str.length()-1;
		int count=0;
		while(j>i && str.charAt(i)!=str.charAt(j))
		{
			j--;
		}
		count=j-i-1;
		if(mcount<count)
		{
			mcount=count;
		}
	}
	System.out.println(mcount);
	}
}
