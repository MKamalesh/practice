package zoho_int_que;

public class Merge_array_without_dupli {
public static void main(String[] args) {
	int a1[]= {1, 2, 3, 6, 9};
	int a2[]= {2, 4, 5, 10};
	int res[]=new int[a1.length+a2.length];
	int k=0;
	for(int i=0;i<a1.length;i++)
	{
		res[k]=a1[i];
		k++;
	}
	for(int i=0;i<a2.length;i++)
	{
		res[k]=a2[i];
		k++;
	}
	for(int i=0;i<res.length;i++)
	{
		for(int j=i+1;j<res.length;j++)
		{
			if(res[i]==res[j])
			{
				res[j]=-1;
			}
		}
	}
	for(int i=0;i<res.length;i++)
	{
		for(int j=i+1;j<res.length;j++)
		{
			if(res[i]>res[j])
			{
				int temp=res[i];
				res[i]=res[j];
				res[j]=temp;
			}
		}
	}
	for(int j=0;j<res.length;j++)
	{
		if(res[j]!=-1)
		{
			System.out.print(res[j]+" ");
		}
	}
}
}
