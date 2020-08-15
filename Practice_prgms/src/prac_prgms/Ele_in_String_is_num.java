package prac_prgms;


public class Ele_in_String_is_num {
public static void main(String[] args) {
	String s[]= {"abc","123","def"};
	for(int i=0;i<s.length;i++)
	{
		String str=s[i];
		char c[]=str.toCharArray();
		for(int j=0;j<c.length;j++)
		{
			if(c[i]=='0'||c[i]=='1'||c[i]=='2'||c[i]=='3'||c[i]=='4'||c[i]=='5'||c[i]=='6'||c[i]=='7'||c[i]=='8'||c[i]=='9')
			{
				System.out.print((char)c[i]);
			}
		}
	}
}
}
