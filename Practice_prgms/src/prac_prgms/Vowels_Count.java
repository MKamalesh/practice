package prac_prgms;

public class Vowels_Count {
public static void main(String[] args) {
	String str="life is beautiful enjoy it";
	char c[]=str.toCharArray();
	int count=0;
	for(int i=0;i<c.length;i++)
	{
		if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u')
		{
			count++;
		}
	}
	System.out.println(count);
}
}
