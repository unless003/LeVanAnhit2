package Test;
import java.util.Scanner;
import java.io.File;
public class bai65 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner in = new Scanner(System.in);
	        System.out.print("so dau tien : ");
	        int a = in.nextInt();  
			System.out.print("so thu hai: ");
			int b = in.nextInt(); 
			int divided = a / b;
			int result = a - (divided * b);
			System.out.println(result); 
	}

}
