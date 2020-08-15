package prac_prgms;

public class String_rev_by_char {
public static void main(String[] args) {
	String str="life is beautiful enjoy it";
	for(int i=str.length()-1;i>=0;i--)
	{
		System.out.print(str.charAt(i));
	}
}
}
