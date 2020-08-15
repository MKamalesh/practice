package prac_prgms;

public class First_and_Second_greater {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5},max=0,max2=0;
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]<a[j])
			{
				max=a[j];
				max2=a[i];
			}
		}
	}
System.out.println(max);
System.out.println(max2);
}
}
