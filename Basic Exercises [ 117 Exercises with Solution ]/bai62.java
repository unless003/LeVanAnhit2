package Test;

import java.util.Scanner;

public class bai62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        System.out.print("so thu nhat : ");
        int x = in.nextInt();  
		System.out.print("so thu hai: ");
		int y = in.nextInt(); 
		System.out.print("so thu ba : ");
        int z = in.nextInt(); 
        System.out.println((Math.abs(x - y) >= 20 || Math.abs(y - z) >= 20 || Math.abs(z - x) >= 20));
	}

}
