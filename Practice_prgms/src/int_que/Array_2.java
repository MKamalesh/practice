package int_que;

public class Array_2 {
public static void main(String[] args) {
	int a[]= {1,2,4,3,5,6};
	int n=5,count=0;
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]+a[j]==n)
			{
				count++;
			}
		}
	}
	System.out.println(count);
}
}
