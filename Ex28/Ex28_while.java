package Ex28;

import java.util.Scanner;

public class Ex28_while {
public static void main(String []args) {
	
	Scanner ler = new Scanner(System.in);
	
	int n, c, t;
	
	n = 0;
	t = 0;
	
	
	while(n < 100) {
		c = n + 1;
		t = t + c;
		System.out.printf("\n%d+", c);
		n++;
	}
	
	System.out.printf("\nTotal: %d", t);
}
}
