package Test;

import java.util.Scanner;

public class bai33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner input = new Scanner(System.in);
	        System.out.print("nhap so: ");
	        long n = input.nextLong();
	        System.out.println("tong cac con so: " + sumDigits(n));

	    }

	    public static int sumDigits(long n) {
	        int sum = 0;
	        while (n != 0) {
	            sum += n % 10;
	            n /= 10;
	        }
	        return sum;
	}

}
