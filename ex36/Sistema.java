package ex36;

import java.util.Scanner;

public class Sistema {
public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);

		Produto[] listaProdutos = new Produto[5];
		int id;
		String nome;
		Double preco;
		Double quantidade;
		Categoria categoria;
		char possuiCategoria;
	
	
		for (int i=0; i<2; i++) {
			Produto produto = new Produto();
			
			System.out.printf("\nDigite o id do produto: ");
			id = ler.nextInt();
			produto.setId(id);
			
			System.out.printf("Digite o nome do produto: ");
			nome = ler.next();
			produto.setNome(nome);
			
			System.out.printf("Digite o preço do produto: ");
			preco = ler.nextDouble();
			produto.setPreco(preco);
			
			System.out.printf("Digite a quantidade: ");
			quantidade = ler.nextDouble();
			produto.setQuantidade(quantidade);
			
			System.out.printf("O produto possui categoria? (S/N) :");
			possuiCategoria = ler.next().charAt(0);
			
			
			if (possuiCategoria == 'S') {
				Categoria cat = new Categoria();
				
				cat.setIdCategoria(id);
				
				System.out.printf("Escreva o nome da categoria:");
				nome = ler.next();
				cat.setNomeCategoria(nome);
				
				categoria = cat;

			}
			else {
				categoria = null;
			}
			
			Produto p = new Produto(id, nome, preco, quantidade, categoria);
			listaProdutos[i] = p;
			
			
		}
	
	for (int i=0; i<2; i++) {
		System.out.printf("\nID:%d - Nome:%s - Valor:%.2f - Quantidade:%.2f ", listaProdutos[i].getId(), listaProdutos[i].getNome(), listaProdutos[i].getPreco(), listaProdutos[i].getQuantidade());
	}
	

	}
}
