package Test;

import java.util.Scanner;

public class bai54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//chương trình Java chấp nhận ba số nguyên từ người sử dụng và trả về đúng nếu hai hoặc nhiều số (số nguyên) có cùng một chữ số bên phải. Các số nguyên không âm.
		 Scanner in = new Scanner(System.in);
	        System.out.print("so dau tien : ");
	        int x = in.nextInt();  
			System.out.print("Iso thu hai: ");
			int y = in.nextInt(); 
			System.out.print("so thu ba: ");
	        int z = in.nextInt(); 
	        System.out.print("ket qua: "+test_last_digit(x, y, z,true));
			System.out.print("\n");
	    }
	   
	    public static boolean test_last_digit(int p, int q, int r, boolean xyz)
	     {
		     return (p % 10 == q % 10) || (p % 10 == r % 10) || (q % 10 == r % 10);
	}

}
