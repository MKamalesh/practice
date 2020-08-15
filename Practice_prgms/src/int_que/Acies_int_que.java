package int_que;

import java.util.Scanner;

public class Acies_int_que {
public static void main(String[] args) {
	System.out.println("enter the number less than or equal to 4 digits:\n");
	Scanner sc=new Scanner(System.in);
	String str=sc.next();
	int len=str.length();
	char c[]=str.toCharArray();
	if(len==0)
	{
		System.out.println("please enter the valid number");
	}
	else if(len>4)
	{
		System.out.println("enter the number less than equal to 4 digits");
	}
	String single_dig[]= {"zero","one","two","three","four","five","six","seven","eight","nine"};
	String two_dig[]= {"","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen",
			           "seventeen","eighteen","nineteen"};
	String ten_mul[]= {"","","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
	String power_mul[]= {"hundred","thousand"};
	int i=0;
	while(i<len)
	{
	if(len>=3)
	{
		if(c[i]-'0'!=0) {
		System.out.print(single_dig[c[i]-'0']+" ");
		System.out.print(power_mul[len-3]+" ");
		}
		--len;
	}
	else {
		if(c[i]-'0'==1)
		{
			int sum=c[i]-'0'+c[i]-'0';
			System.out.print(two_dig[sum]+" ");
			break;
		}
		else if(c[i]-'0'==2&&c[i+1]-'0'==0)
		{
			System.out.print("twenty"+" ");
		}
		else {
			int n=(c[i]-'0');
			if(n>0) {
				System.out.print(ten_mul[n]);
			}
			else {
				System.out.println("");
			}
				++i;
			if(c[i]-'0'!=0) {
			    System.out.print(single_dig[c[i]-'0']);
			}
			}
	}
	i++;
	}
	
}
}
