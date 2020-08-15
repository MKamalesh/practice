package new_pattern_prac;

public class Triangle_star {
public static void main(String[] args) {
	int n=5;
	for(int r=1;r<=n;r++)
	{
		for(int s=n-r;s>=1;s--)
		{
			System.out.print(" ");
		}
		for(int c=1;c<=r;c++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
	/*for (int i=0; i<n; i++) 
    { 
        for (int j=n-i; j>1; j--) 
        { 
            // printing spaces 
            System.out.print(" "); 
        } 
        for (int j=0; j<=i; j++ ) 
        { 
            // printing stars 
            System.out.print("* "); 
        } 
        System.out.println(); 
    } */
}
}
