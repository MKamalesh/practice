package zoho_int_que;

public class Array_and_threshold {
public static void main(String[] args) {
	int a[]={5,8,10,13,6,2};
	int res[]=new int[a.length];
	for(int i=0;i<a.length;i++)
	{
		int t=3;
		int count=0;
		int n=a[i];
		while(n>0)
		{
			if(n>=t)
			{
				n=n-t;
				count++;
			}
			else
			{
				t--;
			}
		}
		res[i]=count;
		
	}
	for(int i=0;i<res.length;i++)
	{
		System.out.println(res[i]);
	}
}
}
