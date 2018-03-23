package Test;

import java.util.Scanner;

public class bai7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		   
		  System.out.print("nhap so: ");
		  int a = in.nextInt();
		   
		  for (int i=0; i< 10; i++){
		   System.out.println(a + " x " + (i+1) + " = " + 
		     (a * (i+1)));
		  }
	}

}
