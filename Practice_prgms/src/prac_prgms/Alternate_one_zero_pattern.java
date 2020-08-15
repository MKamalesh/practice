package prac_prgms;

public class Alternate_one_zero_pattern {
public static void main(String[] args) {
	for(int r=1;r<=5;r++)
	{
		for(int c=1;c<=5;c++)
		{
			if(r%2==1)
			{
				if(c%2==1)
				System.out.print("1"+" ");
				else 
				System.out.print("0"+" ");
			}
			else if(r%2==0)
			{
				if(c%2==1)
				System.out.print("0"+" ");
				else
				System.out.print("1"+" ");
			}
		}
		System.out.println();
	}
}
}
