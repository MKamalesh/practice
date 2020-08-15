package array_prac_prgms;

public class Method_try {
public static void main(String[] args) {
	int result=sum(5,10);
	System.out.println(result);
}

private static int sum(int i, int j) {
    if(j>i)
	{
 		return j+sum(i,j-1);
	}
	else {
		return j;
	}
	// TODO Auto-generated method stub

}
}



