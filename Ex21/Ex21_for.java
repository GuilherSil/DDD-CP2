package Ex21;

import java.util.Scanner;

public class Ex21_for {
public static void main(String []args) {
Scanner ler = new Scanner(System.in);	
			
	int num;

	System.out.printf("Digite um número positivo: ");
	num = ler.nextInt();

	for (;num <= 0;) {
		System.out.printf("Inválido. Utilize um número positivo: ");
		num = ler.nextInt();
	}
			
	System.out.printf("%d", num);
			
}
}
