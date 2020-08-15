package new_pattern_prac;

public class combined_star_pattern_1 {
public static void main(String[] args) {
	int n=5;
	for(int r=1;r<=5;r++)
	{
		for(int c=1;c<=2*n;c++)
		{
			for(int c1=1;c<=(2*n)/2;c++)
			{
				for(int i=1;i<=5;i++)
				{
					for(int j=5;i>=1;j--)
					{
						System.out.print("*");
					}
					System.out.println();
				}
			}
			for(int c1=((2*n)/2)+1;c1<=2*n;c1++)
			{
				for(int i=1;i<=5;i++)
				{
					for(int s=1;s<i;s++)
					{
						System.out.print(" ");
					}
					for(int j=5;i>1;j--)
					{
						System.out.print("*");
					}
					System.out.println();
				}
			}
		}
	}
	
}
}
