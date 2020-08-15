package array_prac_prgms;

public class Product_sub_arrays {
public static void main(String[] args) {
	int a[]= {10,3,7};
	int len=a.length;
	product_arrays(a,len);
}

/*private static void product_arrays(int[] a, int len) {
    int res=1;
	
	for(int i=0;i<len;i++)
	{
		int prod=1;
		for(int j=i;j<len;j++)
		{
			prod=prod*a[j];
			res*=prod;
		}
	}
	System.out.println(res);
	 
}*/
static void product_arrays(int arr[], int n) 
{ 
    // Variable to store the product 
    int res = 1; 

    // Compute the product while 
    // traversing for subarrays 
    for (int i = 0; i < n; i++) { 
        int product = 1; 
        for (int j = i; j < n; j++) { 
            product = product * arr[j]; 
            res *= product; 
        } 
    } 

    // Printing product of all subarray 
    System.out.println(res + "\n"); 
} 

    
	// TODO Auto-generated method stub
	  
	 
	
}

