package zoho_int_que;

public class Array_merge_2 {
public static void main(String[] args) {
	int a1[]= {1, 2, 3, 6, 9};
	int a2[]= {2, 4, 5, 10};
	int res[]=new int[a1.length+a2.length];
	int k=0;
	for(int i=0;i<a1.length;i++)
	{
		res[i]=a1[i];
		k++;
	}
	for(int j=0;j<a2.length;j++)
	{
		res[k]=a2[j];
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
		if(res[i]!=-1)
		{
			System.out.print(res[i]+" ");
		}
	}
}
}
