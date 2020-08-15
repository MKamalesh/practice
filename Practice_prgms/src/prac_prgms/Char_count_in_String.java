package prac_prgms;

public class Char_count_in_String {
public static void main(String[] args) {
	String str="Kamal1998%";
	char c[]=str.toCharArray();
	int count=0;
	for(int i=0;i<c.length;i++)
	{
		char c1=str.charAt(i);
		if(c1==c[i])
		{
			count++;
		}
	}
	System.out.println(count);
}
}
