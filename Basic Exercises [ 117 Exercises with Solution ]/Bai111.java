import java.util.Scanner;
public class Bai111 {
     public static void main(String[] arg) 
	 {
	   int x, y ;
	   Scanner in = new Scanner(System.in);	
	   System.out.print("Nhap so thu nhat: ");
	   x = in.nextInt(); 
	   System.out.print("Nhap so thu hai: ");
	   y = in.nextInt(); 
      while(y != 0){
            int carry = x & y;
            x = x ^ y;
            y = carry << 1;
        }
        System.out.print("Tong la: "+x); 
		System.out.print("\n");     	
	}	
}
