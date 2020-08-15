package array_prac_prgms;

public class Half_len_desc {
public static void main(String[] args) {
	int a[]= {10,20,30,40,50,60};
	int k=0;
	for(int i=0;i<a.length/2;i++)
	{
		for(int j=i+1;j<a.length/2;j++)
		{
			if(a[i]<a[j])
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				k++;
			}
		}
	}
	if(k!=a.length/2)
	{
		while(k!=a.length/2)
		{
			k--;
		}
	}
	for(int i=k;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]<a[j])
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
