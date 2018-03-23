package Test;

import java.util.Scanner;

public class bai37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// dao nguoc chuoi
	      Scanner scanner = new Scanner(System.in);
	        System.out.print("nhap chuoi: ");
	        char[] letters = scanner.nextLine().toCharArray();
	        System.out.print("xuat chuoi: ");
	        for (int i = letters.length - 1; i >= 0; i--) {
	            System.out.print(letters[i]);
	        }
	        System.out.print("\n");
	}

}
