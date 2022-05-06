package Ex32_33;

import java.util.Scanner;

public class Ex33 {
public static void main(String []args) {
Scanner ler = new Scanner(System.in);

	Produto[] listaProdutos = new Produto[10];
			
	for (int i=0; i <=9; i++) {
		Produto p = new Produto();
				
		System.out.printf("Digite o ID: ");
		p.id = ler.nextInt();
		System.out.printf("Digite a descrição: ");
		p.descricao = ler.next();
		System.out.printf("Digite o valor: ");
		p.valor = ler.nextDouble();
		System.out.printf("Digite a quantidade: ");
		p.quantidade = ler.nextDouble();
				
		listaProdutos[i] = p;
				
		if (i==9) {
			for (int n=0; n <=9; n++ ) {
				if (listaProdutos[n].valor < 100) {
					System.out.printf("\nID:%d . Descrição:%s . Valor:%.2f . Quantidade:%.2f", listaProdutos[n].id, listaProdutos[n].descricao, listaProdutos[n].valor, listaProdutos[n].quantidade);
				}
			}
		}
	}
}
}