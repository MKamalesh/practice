package zoho_int_que;

public class Add_min_max_Array {
public static void main(String[] args) {
	int a[]= {7,9,11,4,5,2,1,0,-1,3,12};
	sorting(a);
	Addition(a);
}

private static void Addition(int[] a) {
	int i=0,j=a.length-1;
	while(i<=j)
	{
		if(i==j)
		{
			System.out.print(a[i]+" ");
		}
		else {
			System.out.print(a[i]+a[j]+" ");
		}
		i++;
		j--;
	}
	// TODO Auto-generated method stub
	
}

private static void sorting(int[] a) {
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]>a[j])
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	// TODO Auto-generated method stub
	
}
}
