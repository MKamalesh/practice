package zoho_int_que;

public class Sliding_window {
public static void main(String[] args) {
	int a[]= {3,2,7,6,5,1,2,3,4};
	int k=3;
	int m=k;
	int res[]=new int[a.length];
	int b=0,c=0;
	for(int i=0;i<a.length;i++)
	{
		c=0;
		int find[]=new int[m];
	for(int j=b;j<k;j++)
	{
		find[c]=a[j];
		System.out.println(find[c]);
		c++;
	}
	
	for(int d=0;d<find.length;d++)
	{
		for(int e=d+1;e<find.length;e++)
		{
			if(find[d]>find[e])
			{
				int temp=find[d];
				find[d]=find[e];
				find[e]=temp;
			}
		}
	}
	res[i]=find[0];
	b++;
	k++;
	}
	for(int i=0;i<res.length;i++)
	{
		System.out.print(res[i]+" ");
	}
}
}
