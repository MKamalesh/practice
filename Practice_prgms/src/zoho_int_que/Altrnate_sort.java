package zoho_int_que;

public class Altrnate_sort {
public static void main(String[] args) {
	int a[]= {5,2,8,7,4,3,9};
	for(int i=0;i<a.length-2;i++)
	{
		for(int j=0;j<a.length-2;j++)
		{
			if(j%2==0)
			{
				if(a[j]<a[j+2])
				{
					int temp=a[j];
					a[j]=a[j+2];
					a[j+2]=temp;
				}
			}
			else {
				if(a[j]>a[j+2])
				{
					int temp=a[j];
					a[j]=a[j+2];
					a[j+2]=temp;
				}
			}
		}
	}
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+" ");
	}
}
}
