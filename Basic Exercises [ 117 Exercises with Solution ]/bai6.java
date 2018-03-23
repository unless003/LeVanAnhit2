package Test;

import java.util.Scanner;

public class bai6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		 System.out.print("so dau tien: ");
		  int a = in.nextInt();
		   
		  System.out.print("so thu hai: ");
		  int b = in.nextInt();
		   
		  System.out.println(a + " + " + b + " = " +  (a + b));
		   
		  System.out.println(a + " - " + b + " = " + (a - b));
		   
		  System.out.println(a + " x " + b + " = " +  (a * b));
		   
		  System.out.println(a + " / " + b + " = " +   (a / b));
		 
		  System.out.println(a + " mod " + b + " = " +  (a % b));
	}

}
