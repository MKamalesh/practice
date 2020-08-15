package array_prac_prgms;

public class Scrambled_string {
public static void main(String[] args) {
	String s1="manohar";
	String s2="nahroma";
	char c1[]=s1.toCharArray();
	char c2[]=s2.toCharArray();
	int count=0;
	if(c1.length==c2.length)
	{
		for(int i=0;i<c1.length;i++)
		{
			for(int j=0;j<c2.length;j++)
			{
				if(c1[i]==c2[j])
				{
					count++;
					break;
				}
			}
	}
		
	
}
	if(count==c1.length)
	{
		System.out.println("s2 is scrambled form of s1");
	}
	else {
		System.out.println("not scrambled");
	}


	// TODO Auto-generated method stub
	
}
}
