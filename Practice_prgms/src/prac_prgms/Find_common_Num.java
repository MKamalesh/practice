package prac_prgms;

import java.util.Arrays;

public class Find_common_Num {
public static void main(String[] args) {
	int a1[]= {1,2,3,4,5};
	int a2[]= {6,7,2,9,1};
	Arrays.sort(a1);
	Arrays.sort(a2);
	for(int i=0;i<a1.length;i++)
	{
		if(a1[i]==a2[i])
		{
			System.out.println(a1[i]);
		}
	}
}
}
