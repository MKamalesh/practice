package new_pattern_prac;

public class star_right_pattern {
public static void main(String[] args) {
	int n=5;
	for(int r=1;r<=n;r++)
	{
		for(int s=n;s>r;s--)
		{
			System.out.print(" ");
		}
		for(int c=1;c<=r;c++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
}
}
