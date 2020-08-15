package prac_prgms;

public class String_rev_by_words {
public static void main(String[] args) {
	String str="life is beautiful enjoy it";
	String s[]=str.split(" ");
	String rev="";
	for(int i=s.length-1;i>=0;i--)
	{
		rev=rev+s[i]+" ";
	}
	System.out.println(rev);
}
}
