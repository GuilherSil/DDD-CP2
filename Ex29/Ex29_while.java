package Ex29;

import java.util.Scanner;

public class Ex29_while {
public static void main(String []args) {
	
	Scanner ler = new Scanner(System.in);
	
	int c, n1, n2, n3;
	
	c = 1;
	n1 = 1;
	n2 = 1;
	
	
	while(c <= 30) {
		System.out.printf("\n%d? - %d", c, n1);
		n3 = n1 + n2;
		n1 = n2;
		n2 = n3;
		c++;
	}
}
}
