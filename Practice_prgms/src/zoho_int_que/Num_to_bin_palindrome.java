package zoho_int_que;

import java.util.Scanner;

public class Num_to_bin_palindrome {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int n=sc.nextInt();
	String rem="";
	while(n>0)
	{
		rem=(n%2)+rem;
		n=n/2;
	}
	String cpy="";
	for(int i=rem.length()-1;i>=0;i--)
	{
		cpy=cpy+rem.charAt(i);
	}
	if(rem.equals(cpy))
	{
		System.out.println("palindrome");
	}
	else {
		System.out.println("not palindrome");
	}
}
}
