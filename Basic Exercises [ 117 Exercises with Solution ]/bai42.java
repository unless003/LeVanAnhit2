package Test;

import java.io.Console;

public class bai42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Console cons;
		if ((cons = System.console()) != null) {
			char[] pass_ward = null;
			try {
				pass_ward = cons.readPassword("nhap pass cua ban:");
				System.out.println("pass cua ban la: " + new String(pass_ward));
			} finally {
				if (pass_ward != null) {
					java.util.Arrays.fill(pass_ward, ' ');
				}
			}
		} else {
			throw new RuntimeException("ko the lay pass cua ban");
		}
	}

}
