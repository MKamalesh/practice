package array_prac_prgms;

public class Codeboard_int_2 {
public static void main(String[] args) {
	int a[]= {7,9,11,4,5,2,1,0,-1,3,12};
	int even[]=new int[a.length];
	int odd[]=new int[a.length];
	int res[]=new int[a.length];
	int j=0,k=0;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]!=0)
		{
			if(a[i]%2==0)
			{
				even[j]=a[i];
				j++;
			}
			else {
				odd[k]=a[i];
				k++;
			}
		}
	}
	for(int i=0;i<odd.length;i++)
	{
		System.out.print(odd[i]+" ");
	}
	System.out.println("\n");
	for(int i=0;i<even.length;i++)
	{
		System.out.print(even[i]+" ");
	}
	System.out.println("\n");
	for(int i=0;i<a.length;i++)
	{
		if(odd[i]>even[i])
		{
			res[i]=odd[i]-even[i];
		}
		else {
			res[i]=odd[i]+even[i];
		}
	}
	for(int i=0;i<res.length;i++)
	{
		System.out.print(res[i]+" ");
	}
}
}
