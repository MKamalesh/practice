package int_que;

public class Array_1 {
public static void main(String[] args) {
	int a[]= {2,2,0,4,0,8};
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]==a[j])
			{
				a[i]=a[i]*a[i];
				a[j]=0;
				break;
			}
			
		}
	}
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]==0)
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			
		}
	}
	
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+" ");
	}
}
}
