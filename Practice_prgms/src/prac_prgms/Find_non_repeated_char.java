package prac_prgms;

public class Find_non_repeated_char {
public static void main(String[] args) {
	String str="aabbbbcdddddddddde";
	char c[]=str.toCharArray();
	for(int i=0;i<c.length;i++)
	{
		int count=0;
		for(int j=i+1;i<c.length;j++)
		{
			if(c[i]==c[j])
			{
				count++;
			}
		}
		if(count==0)
		{
			System.out.println(c[i]);
			break;
		}
	}
	
}
}
