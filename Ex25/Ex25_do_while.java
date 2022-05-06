package Ex25;

import java.util.Scanner;

public class Ex25_do_while {
public static void main (String []args) {
Scanner ler = new Scanner(System.in);	

int numA, n, produto;

do {
	System.out.printf("Digite um valor positivo para o multiplicando: ");
	numA = ler.nextInt();
}
while (numA <= 0);




n = 1;

do {
	produto = numA * n;
	System.out.printf("%d X %d = %d\n", numA, n, produto);
	n++;
}
while (n <= 10);
	
	
}
}
