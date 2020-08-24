package zoho_int_que;

import java.util.Scanner;

public class Square_num_btw_two_num {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter two numbers");
	int a=sc.nextInt();
	int b=sc.nextInt();
	for(int i=a;i<=b;i++)
	{
		for(int j=1;j<=a;j++)
		{
			if(j*j==i)
			{
				System.out.print(i+" ");
			}
		}
	}
}
}
