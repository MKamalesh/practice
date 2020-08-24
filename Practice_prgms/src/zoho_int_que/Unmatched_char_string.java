package zoho_int_que;

public class Unmatched_char_string {
public static void main(String[] args) {
	String s1= "abcdefghi";
    String s2="abdeeggii";
    for(int i=0;i<s1.length();i++)
    {
    	String s="";
    	if(s1.charAt(i)!=s2.charAt(i))
    	{
    		s=s+s1.charAt(i)+s2.charAt(i);
    		System.out.print(s+",");
    	}
    	
    }
}
}
