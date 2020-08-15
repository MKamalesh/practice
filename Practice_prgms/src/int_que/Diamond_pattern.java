package int_que;

public class Diamond_pattern {
public static void main(String[] args) {
	int n=3;
	for(int r=1;r<=n;r++)
	{
		for(int space=n;space>r;space--)
		{
			System.out.print(" ");
		}
		for(int c=1;c<=2*r-1;c++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	for(int r=n*2-2;r<=n*2-1;r++)
	{
		for(int space=1;space<r-2;space++)
		{
			System.out.print(" ");
		}
		for(int c=r;c>1;c--)
		{
			System.out.print("*");
		}
		System.out.println();
	}
}
}
