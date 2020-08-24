package zoho_int_que;

public class Factors_num_count {
public static void main(String[] args) {
	int a[]={5, 11, 10, 20, 9, 16, 23};
	int res[]=new int[a.length];
	for(int j=0;j<a.length;j++)
	{
		int i=1;
		int count=0;
		int n=a[j];
		for(int k=1;k<=a[j];k++)
		{
			if(n%k==0)
			{
				count++;
			}
		}
		res[j]=count;
	}
	/*for(int j=0;j<res.length;j++)
	{
		System.out.print(res[j]+" ");
	}*/
	for(int j=0;j<res.length;j++)
	{
		for(int k=j+1;k<res.length;k++)
		{
			 if(res[j]<res[k])
		{
			int temp=res[j];
			res[j]=res[j+1];
			res[j+1]=temp;
			/*temp=a[j];
			a[j]=a[j+1];
			a[j+1]=temp;*/
		}
	}
	}
	for(int j=0;j<a.length;j++)
	{
		System.out.print(res[j]+" ");
	}
}
}
