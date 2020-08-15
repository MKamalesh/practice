package prac_prgms;

public class String_Palindrome {
public static void main(String[] args) {
	String str="12321";
    StringBuilder sb=new StringBuilder(str);
    StringBuilder sb2=sb.reverse();
    String str2=sb2.toString();
    if(str.equals(str2))
    {
    	System.out.println("palindrome");
    }
    else {
    	System.out.println("not palindrome");
    }
}
}
