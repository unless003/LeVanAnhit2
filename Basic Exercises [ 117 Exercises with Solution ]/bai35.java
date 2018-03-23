package Test;

import java.util.Scanner;

public class bai35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
	        System.out.print("so mat cua hinh da giac: ");
	        int ns = input.nextInt();
	        System.out.print("kich thuoc cua 1 canh: ");
	        double side = input.nextDouble();
	        System.out.print("dien tich la: " + polygonArea(ns, side)+"\n");
	    }
	    public static double polygonArea(int ns, double side) {
	        return (ns * (side * side)) / (4.0 * Math.tan((Math.PI / ns)));
	}

}
