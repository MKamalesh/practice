package int_que;

public class Codeboard_que {
public static void main(String[] args) {
	int a[]={10,20,30,40,10,50,60,10,20};
	int freq[]=new int[a.length];
	
	for(int i=0;i<a.length;i++)
	{
		int count=1;
	for(int j=i+1;j<a.length;j++)
	{
	if(a[i]==a[j])
	{
	count++;
	freq[j]=-1;
	}
	}
	if(freq[i]!=-1)
	{
	freq[i]=count;
	}
	}
	for(int i=0;i<a.length;i++)
	{
	if(freq[i]!=-1)
	{
	System.out.println(a[i]+"occurs "+freq[i]+"times");
	}
	}
}
}
