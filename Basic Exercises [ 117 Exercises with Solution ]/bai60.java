package Test;

import java.util.Scanner;

public class bai60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			     Scanner in = new Scanner(System.in);
			     System.out.print("nhap cau: ");
				 String line = in.nextLine();
				 String[] words = line.split("[ ]+");
				 System.out.println("tu gan cuoi: "+words[words.length - 2]);
	}

}
