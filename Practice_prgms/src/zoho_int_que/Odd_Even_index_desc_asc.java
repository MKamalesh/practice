package zoho_int_que;

public class Odd_Even_index_desc_asc {
public static void main(String[] args) {
	int a[]= {13,2,4,15,12,10,5};
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
