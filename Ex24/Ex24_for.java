package Ex24;

import java.util.Scanner;

public class Ex24_for {
public static void main (String []args) {
Scanner ler = new Scanner(System.in);	

	int num5, n, total;

	num5 = 5;
				
	for (n = 1; n <= 10; n++ ) {
		total = num5 * n;
		System.out.printf("%d X %d = %d\n", num5, n, total);
	}
					
}	
}
