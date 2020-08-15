package prac_prgms;

import java.util.Random;

public class Generate_random_num {
	public static void main(String[] args) {
		Random r=new Random();
		int n=r.nextInt();
        System.out.println(n);
	}

}
