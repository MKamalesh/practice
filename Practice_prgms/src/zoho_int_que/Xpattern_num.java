package zoho_int_que;

import java.util.Scanner;

public class Xpattern_num {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter something");
	String s=sc.next();
	char c[]=s.toCharArray();
	int len=c.length;
	
	for(int row=0;row<c.length;row++)
	{
		int j=len-1-row;
		for(int col=0;col<c.length;col++)
		{
			if(col==row || col==j)
			{
				System.out.print(c[col]);
			}
			
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
}
