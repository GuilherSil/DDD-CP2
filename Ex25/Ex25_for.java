package Ex25;

import java.util.Scanner;

public class Ex25_for {
public static void main (String []args) {
Scanner ler = new Scanner(System.in);	
	
int numA, n, produto;

System.out.printf("Digite um valor positivo para o multiplicando: ");
numA = ler.nextInt();
for (;numA <= 0;) {
	System.out.printf("Inv�lido. Digite um valor positivo para o multiplicando: ");
	numA = ler.nextInt();
}


n = 1;

for (n = 1; n <= 10; n++ ) {
	produto = numA * n;
	System.out.printf("%d X %d = %d\n", numA, n, produto);
}
	
	
}
}
