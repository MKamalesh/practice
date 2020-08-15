package int_que;

import java.util.Scanner;

public class Least_mul_till_given_num {
public static void main(String[] args) {
	Least_mul_till_given_num l=new Least_mul_till_given_num();
	System.out.println("enter the number");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	l.findNum(n);
}

private void findNum(int n) {
	int div=2;
	boolean b=true;
	while(b)
	{
	int count=0;
	for(int i=1;i<=n;i++)
	{
		if(div%i==0)
		{
			count++;
			
		}
		else {
			break;
		}
	}
	if(count==n)
	{
		b=false;
		System.out.println(div);
	}
	div++;
	}
	// TODO Auto-generated method stub
	
}
}
