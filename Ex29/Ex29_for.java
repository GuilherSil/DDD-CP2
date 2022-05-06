package Ex29;

import java.util.Scanner;

public class Ex29_for {
public static void main(String []args) {
	
	Scanner ler = new Scanner(System.in);
	
	int c, n1, n2, n3;
	
	n1 = 1;
	n2 = 1;
	
	
	for(c = 1; c <= 30; c++) {
		System.out.printf("\n%dº - %d", c, n1);
		n3 = n1 + n2;
		n1 = n2;
		n2 = n3;
		
	}
	
}
}
