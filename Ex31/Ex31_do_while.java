package Ex31;

import java.util.Scanner;

public class Ex31_do_while {
public static void main(String []args) {
	
	Scanner ler = new Scanner(System.in);
	
	int a, c, n1, m, soma;
	
	n1 = 2;
	m = 3;
	soma = 0;
	a = 1;
	
	
	do {
		System.out.printf("Digite o valor de N (1 ~ 99):");
		c = ler.nextInt();
	}
	while(c >= 100 || c < 1);
	
	do {
		System.out.printf("\n%dº - %d", a, n1);
		soma = soma + n1;
		n1 = n1 + m;
		m = m + 2;
		c--;
		a++;
	}
	while(c >= 1);
	
	System.out.printf("\nA soma de todos os valores resultou em : %d", soma);
}
}
