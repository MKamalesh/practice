package zoho_int_que;

import java.util.Scanner;

public class Pattern_1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int num=sc.nextInt();
	int sum=0;
	for(int row=1;row<=num;row++)
	{
		int b=0;
		int n=num;
		int a=row;
		for(int col=row;col<=num;col++)
		{
			System.out.print(a+" ");
			a=a+n-b;
			b++;
		}
		System.out.println();
	}
}
}
