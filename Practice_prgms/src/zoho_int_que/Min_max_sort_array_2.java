package zoho_int_que;

public class Min_max_sort_array_2 {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6,7};
	int i=0,j=a.length-1;
	while(i<=j)
	{
		if(i==j)
		{
			System.out.print(a[i]+" ");
		}
		else {
			System.out.print(a[j]+" "+a[i]+" ");
		}
		i++;
		j--;
	}
}
}
