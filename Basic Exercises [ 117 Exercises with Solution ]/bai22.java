package Test;

import java.util.Scanner;

public class bai22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
		  long binaryNumber, decimalNumber = 0, j = 1, remainder;
		  System.out.print("nhap so nhi phan: ");
		  binaryNumber = sc.nextLong();

		  while (binaryNumber != 0) 
		  {
		   remainder = binaryNumber % 10;
		   decimalNumber = decimalNumber + remainder * j;
		   j = j * 2;
		   binaryNumber = binaryNumber / 10;
		  }
		  System.out.println("so thap phan la: " + decimalNumber);
	}

}
