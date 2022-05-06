package Ex25;

import java.util.Scanner;

public class Ex25_while {
public static void main (String []args) {
Scanner ler = new Scanner(System.in);	
	
int numA, n, produto;

System.out.printf("Digite um valor positivo para o multiplicando: ");
numA = ler.nextInt();
while(numA <= 0) {
	System.out.printf("Inválido. Digite um valor positivo para o multiplicando: ");
	numA = ler.nextInt();
}

n = 1;

while (n <= 10) {
	produto = numA * n;
	System.out.printf("%d X %d = %d\n", numA, n, produto);
	n++;

}
	
}
}
