package Ex26;

import java.util.Scanner;

public class Ex26_do_while {
public static void main (String []args) {
Scanner ler = new Scanner(System.in);	
	
int numX, numA, numB, produto;

do {
	System.out.printf("Digite um valor positivo para o multiplicando: ");
	numX = ler.nextInt();
}
while (numX <= 0);


System.out.printf("Digite o intervalo inicial do multiplicador: ");
numA = ler.nextInt();


do {
	System.out.printf("Digite o intervalo final do multiplicador (deve ser maior que o inicial): ");
	numB = ler.nextInt();
}
while (numA >= numB);

do {
produto = numX * numB;
System.out.printf("%d X %d = %d\n", numX, numB, produto);
numB--;
}
while (numA <= numB);

}
}
