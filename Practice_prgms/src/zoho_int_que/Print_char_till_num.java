package zoho_int_que;

public class Print_char_till_num {
public static void main(String[] args) {
	String s="a1b10";
	String str="";
	char c[]=s.toCharArray();
	char c1[]=new char[c.length];
	int a[]=new int[c.length];
	int k=0,n=0;
	for(int i=0;i<c.length-1;i++)
	{
		if(c[i]>='a' && c[i]<='z')
		{
			c1[n]=c[i];
			n++;
		}
	    else if((c[i]>='0'&& c[i]<='9')&&(c[i+1]>='0'&& c[i+1]<='9'))
		{
			str=str+c[i]+c[i+1];
			a[k]=Integer.parseInt(str);
			k++;
		}
		else if(c[i]>='0' && c[i]<='9')
		{
			a[k]=(int)c[i]-48;
			k++;
		}
	}
	int ch=0;
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i];j++)
		{
			System.out.print(c1[i]+"");
		}
		ch++;
	}
}
}
