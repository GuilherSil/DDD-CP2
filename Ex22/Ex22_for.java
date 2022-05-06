package Ex22;

import java.util.Scanner;

public class Ex22_for {
public static void main (String []args) {
Scanner ler = new Scanner(System.in);	
			
	int num1,num2;
			
	System.out.printf("Digite o primeiro valor: ");
	num1 = ler.nextInt();
	System.out.printf("Digite o segundo valor: ");
	num2 = ler.nextInt();
			
	for (;num1 >= num2;) {
		System.out.printf("O segundo valor deve ser maior. Tente novamente: ");
		num2 = ler.nextInt();
	}

	System.out.printf("%d é maior que %d.", num2, num1);
			
}
}
