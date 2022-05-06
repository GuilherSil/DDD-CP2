package Ex30;

import java.util.Scanner;

public class Ex30_for {
public static void main(String []args) {
	
	Scanner ler = new Scanner(System.in);
	
	int a, n1, n2, n3, n4;
	
	n1 = 1;
	n2 = 1;
	n3 = 1;
	
	for(a = 1; a <= 20; a++) {
		System.out.printf("\n%dº - %d", a, n1);
		n4 = n3 + n2 + n1;
		n1 = n2;
		n2 = n3;
		n3 = n4;
	}
}
}
