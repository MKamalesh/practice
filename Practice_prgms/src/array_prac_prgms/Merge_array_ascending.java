package array_prac_prgms;

public class Merge_array_ascending {
public static void main(String[] args) {
	int a[]= {1,5,9,10,15,20};
	int b[]= {2,3,8,13};
	int res[]=new int[a.length+b.length];
	int j=0;
	for(int i=0;i<a.length;i++)
	{
		res[j]=a[i];
		j++;
	}
	for(int i=0;i<b.length;i++)
	{
		res[j]=b[i];
		j++;
	}
	for(int i=0;i<res.length;i++)
	{
		for(int k=i+1;k<res.length;k++)
		{
			if(res[i]>res[k])
			{
				int temp=res[k];
				res[k]=res[i];
				res[i]=temp;
			}
		}
	}
	for(int i=0;i<res.length;i++)
	{
		System.out.print(res[i]+" ");
	}
}
}
