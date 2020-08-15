package prac_prgms;

public class Array_netXd {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5};
	
	for(int i=0;i<a.length;i++)
	{
		int sum=0;
		int n=a[i];
		for(int j=0;j<a.length;j++)
		{
			if(a[j]!=n)
			{
				sum+=a[j];
			}
		}
		System.out.println(sum);
	}
}
}
