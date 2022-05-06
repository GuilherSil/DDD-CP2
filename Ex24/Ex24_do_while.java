package Ex24;

import java.util.Scanner;

public class Ex24_do_while {
public static void main (String []args) {
Scanner ler = new Scanner(System.in);	

	int num5, n, total;

	num5 = 5;
	n = 1;
		
	do {
		total = num5 * n;
		System.out.printf("%d X %d = %d\n", num5, n, total);
		n++;
	}
	while (n <=10);
			
}			
}
