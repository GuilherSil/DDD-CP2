package Ex21;

import java.util.Scanner;

public class Ex21_do_while {
public static void main (String []args) {
Scanner ler = new Scanner(System.in);	
	
	int  num;

	
	do {
		System.out.printf("Digite um n�mero positivo: ");
		num = ler.nextInt();
	}
	while(num <= 0); 
	
	System.out.printf("%d", num);
	
	
}
}
