package Ex28;

import java.util.Scanner;

public class Ex28_do_while {
public static void main(String []args) {
	
	Scanner ler = new Scanner(System.in);
	
	int n, c, t;
	
	n = 0;
	t = 0;
	
	do {
		c = n + 1;
		t = t + c;
		System.out.printf("\n%d+", c);
		n++;
	}
	while(n < 100);
	
	System.out.printf("\nTotal: %d", t);
}
}
