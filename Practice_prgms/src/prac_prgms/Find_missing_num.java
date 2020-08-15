package prac_prgms;

public class Find_missing_num {
public static void main(String[] args) {
	int a[]= {1,2,3,5,6},num=0;
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if((a[i]+1)!=a[j])
			{
				num=a[i]+1;
			}
		}
	}
	System.out.println(num);
}
}
