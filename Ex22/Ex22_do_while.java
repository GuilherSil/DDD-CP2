package Ex22;

import java.util.Scanner;

public class Ex22_do_while {
public static void main (String []args) {
Scanner ler = new Scanner(System.in);	
	
	int num1,num2;

	System.out.printf("Digite o primeiro valor: ");
	num1 = ler.nextInt();
	do {
		System.out.printf("Digite o segundo valor, que deve ser maior que o primeiro: ");
		num2 = ler.nextInt();
	}
	while (num1 >= num2);
	
	System.out.printf("%d é maior que %d.", num2, num1);
}
}
