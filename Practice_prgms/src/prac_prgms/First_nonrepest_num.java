package prac_prgms;

import java.util.Arrays;

public class First_nonrepest_num {
public static void main(String[] args) {
		int a[]= {1,2,3,4,5,1,2};
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					a[i]=-1;
					a[j]=-1;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=-1)
			{
				System.out.println(a[i]);
				break;
			}
		}
		
}
}
