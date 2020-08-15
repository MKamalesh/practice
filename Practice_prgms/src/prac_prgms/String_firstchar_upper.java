package prac_prgms;

public class String_firstchar_upper {
public static void main(String[] args) {
	String str="life is beautiful enjoy it";
	String s[]=str.split(" ");
	for(int i=0;i<s.length;i++)
	{
		char c[]=s[i].toCharArray();
	    for(int j=0;j<c.length;j++)
	    {
	    	c[0]=(char) (c[0]-32);
	    	System.out.print(c[j]);
	    }
	    System.out.print(" ");
	}
	
}
}
