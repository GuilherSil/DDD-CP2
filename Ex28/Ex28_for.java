package Ex28;

import java.util.Scanner;

public class Ex28_for {
public static void main(String []args) {
	
	Scanner ler = new Scanner(System.in);
	
	int n, c, t;
	
	t = 0;
	
	for(n = 0 ;n < 100; n++) {
		c = n + 1;
		t = t + c;
		System.out.printf("\n%d+", c);
	}
	
	System.out.printf("\nTotal: %d", t);
}
}
