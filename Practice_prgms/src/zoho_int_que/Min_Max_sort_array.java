package zoho_int_que;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Min_Max_sort_array {
public static void main(String[] args) {
	ArrayList al=new ArrayList();
	Scanner sc=new Scanner (System.in);
	System.out.println("enter the number of arrays");
	int n=sc.nextInt();
	while(n>0)
	{
		System.out.println("enter the array size");
		int a=sc.nextInt();
		for(int i=0;i<a;i++)
		{
			int num=sc.nextInt();
			al.add(num);
		}
		Collections.sort(al);
		sorting(al,a);
		n--;
	}
}

private static void sorting(ArrayList al, int a) {
	int i=0,j=a-1;
	while(i<=j)
	{
		if(i==j)
		{
			System.out.println(al.get(i));
		}
		else {
			System.out.print(al.get(j)+" "+al.get(i)+" ");
		}
		i++;
		j--;
	}
	// TODO Auto-generated method stub
	
}
}
