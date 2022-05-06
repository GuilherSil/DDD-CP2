package Ex27;

import java.util.Scanner;

public class Ex27_do_while {
public static void main(String []args) {
	Scanner ler = new Scanner(System.in);
	
	int tabuada, n, total;
	String ok;
	
	n = 1;
	tabuada = 1;
	
	do {
		do {
			total = tabuada * n;
			System.out.printf("%d X %d = %d\n", tabuada, n, total);
			n++;
		}
		while(n <= 10);
		
		tabuada++;
		System.out.printf("\nEnvie qualquer coisa para visualizar a próxima tabuada:");
		ok = ler.next();
		n = 1;
	}
	while(tabuada < 20);
	
	do {
		total = tabuada * n;
		System.out.printf("%d X %d = %d\n", tabuada, n, total);
		n++;
	}
	while(n <= 10);
	
}
}
