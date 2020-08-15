package array_prac_prgms;

public class Min_Max_elements_sum {
public static void main(String[] args) {
	int a[]= {13,11,45,32,89,21};
	int b[]=new int[a.length];
	int c[]=new int[a.length];
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]>a[j])
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	for(int i=0;i<a.length;i++)
	{
		b[i]=a[i];
	}
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]<a[j])
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	for(int i=0;i<a.length;i++)
	{
		c[i]=a[i];
	}
	int minSum=0,maxSum=0;
	for(int i=0;i<b.length-1;i++)
	{
		minSum+=b[i];
	}
	for(int i=0;i<c.length-1;i++)
	{
		maxSum+=c[i];
	}
	System.out.println("minimum sum is:"+minSum);
	System.out.println("maximum sum is:"+maxSum);
	
}
}
