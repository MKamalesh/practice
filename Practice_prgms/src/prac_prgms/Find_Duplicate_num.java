package prac_prgms;

public class Find_Duplicate_num {
public static void main(String[] args) {
	int a[]= {4,5,6,7,8,9,9,6};
	for(int i=0;i<a.length;i++)
	{
		int count=0;
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]==a[j])
			{
				count++;
			}
		}
		if(count>0)
		{
			System.out.println(a[i]);
		}
	}
}
}
