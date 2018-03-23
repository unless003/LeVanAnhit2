package Test;

import java.util.Scanner;

public class bai34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     Scanner input = new Scanner(System.in);
	        System.out.print("chieu dai 1 canh hinh luc giac: ");
	        double s = input.nextDouble();
	        System.out.print("dien tich hinh luc giac hexagon: " + hexagonArea(s)+"\n");
	    }
	    public static double hexagonArea(double s) {
	        return (6*(s*s))/(4*Math.tan(Math.PI/6));
	}

}
