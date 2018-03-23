package Test;

import java.util.Scanner;

public class bai53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//chương trình Java chấp nhận ba số nguyên từ người dùng và trả lại đúng nếu số thứ hai lớn hơn số đầu tiên và số thứ ba lớn hơn số thứ hai. Nếu "abc" là số thứ hai thực sự không cần phải lớn hơn số đầu tiên.
		  Scanner in = new Scanner(System.in);
	        System.out.print("so dau tien : ");
	        int x = in.nextInt();  
			System.out.print("so thu hai: ");
			int y = in.nextInt(); 
			System.out.print("so thu ba : ");
	        int z = in.nextInt(); 
	        System.out.print("ket qua: "+abc(x, y, z,true));
			System.out.print("\n");
	    }
	    
	    public static boolean abc(int p, int q, int r, boolean xyz)
	     {
		   if(xyz)
			  return (r > q);
		   return (q > p && r > q);
	}

}
