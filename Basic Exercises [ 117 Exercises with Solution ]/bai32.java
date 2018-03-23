package Test;

import java.util.Scanner;

public class bai32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		     // so sanh 2 so
        Scanner input = new Scanner(System.in);
        int number1;   
        int number2;   
      
        System.out.print( "so dau tien: " );      
        number1 = input.nextInt(); 
 
        System.out.print( "so thu hai: " );   
        number2 = input.nextInt();              
        
        if ( number1 == number2 )           
            System.out.printf( "%d == %d\n", number1, number2 );  
        if ( number1 != number2 )          
            System.out.printf( "%d != %d\n", number1, number2 );  
        if ( number1 < number2 )          
            System.out.printf( "%d < %d\n", number1, number2 );  
        if ( number1 > number2 )          
            System.out.printf( "%d > %d\n", number1, number2 );  
        if ( number1 <= number2 )          
            System.out.printf( "%d <= %d\n", number1, number2 );  
        if ( number1 >= number2 )          
            System.out.printf( "%d >= %d\n", number1, number2 ); 
	}

}
