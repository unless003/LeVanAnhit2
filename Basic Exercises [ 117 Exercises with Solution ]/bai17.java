package Test;

import java.util.Scanner;

public class bai17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 long binary1, binary2;
		  int i = 0, remainder = 0;
		  int[] sum = new int[20];
		  Scanner in = new Scanner(System.in);

		  System.out.print("số nhj phân đầu: ");
		  binary1 = in.nextLong();
		  System.out.print("số cnhij phân thu hai: ");
		  binary2 = in.nextLong();

		  while (binary1 != 0 || binary2 != 0) 
		  {
		   sum[i++] = (int)((binary1 % 10 + binary2 % 10 + remainder) % 2);
		   remainder = (int)((binary1 % 10 + binary2 % 10 + remainder) / 2);
		   binary1 = binary1 / 10;
		   binary2 = binary2 / 10;
		  }
		  if (remainder != 0) {
		   sum[i++] = remainder;
		  }
		  --i;
		  System.out.print("tong 2 so nhị phan da nhap: ");
		  while (i >= 0) {
		   System.out.print(sum[i--]);
		  }
		   System.out.print("\n");  
	}

}
