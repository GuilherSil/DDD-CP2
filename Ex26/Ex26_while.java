package Ex26;

import java.util.Scanner;

public class Ex26_while {
public static void main (String []args) {
Scanner ler = new Scanner(System.in);

int numX, numA, numB, produto;

System.out.printf("Digite um valor positivo para o multiplicando: ");
numX = ler.nextInt();

while (numX <= 0) {
	System.out.printf("Inválido. Digite um valor positivo para o multiplicando: ");
	numX = ler.nextInt();
}

System.out.printf("Digite o intervalo inicial do multiplicador: ");
numA = ler.nextInt();
System.out.printf("Digite o intervalo final do multiplicador (deve ser maior que o inicial): ");
numB = ler.nextInt();

if (numA >= numB) {
	while (numA >= numB) {
	System.out.printf("O segundo valor deve ser maior. Tente novamente: ");
	numB = ler.nextInt();
	}
	while (numA <= numB) {
		produto = numX * numB;
		System.out.printf("%d X %d = %d\n", numX, numB, produto);
		numB--;
	}	
}
	
else {
	while (numA <= numB) {
		produto = numX * numB;
		System.out.printf("%d X %d = %d\n", numX, numB, produto);
		numB--;
	}	
}
	
}
}

