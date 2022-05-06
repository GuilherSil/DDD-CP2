package Ex32_33;

import java.util.Scanner;

public class Ex32 {
public static void main(String []args) {
Scanner ler = new Scanner(System.in);

	Cliente[] listaClientes = new Cliente[5];
	
	for (int i=0; i <=4; i++) {
		Cliente p = new Cliente();
		
		System.out.printf("Digite o ID: ");
		p.id = ler.nextInt();
		System.out.printf("Digite o nome: ");
		p.nome = ler.next();
		System.out.printf("Digite a idade: ");
		p.idade = ler.nextInt();
		System.out.printf("Digite o email: ");
		p.email = ler.next();
		
		listaClientes[i] = p;
		
		if (i==4) {
			for (int n=0; n <=4; n++ ) {
				if (listaClientes[n].idade >=18) {
					System.out.printf("\nID:%d . Nome:%s . Idade:%d . Email:%s.", listaClientes[n].id, listaClientes[n].nome, listaClientes[n].idade, listaClientes[n].email);
				}
			}
		}
	}
}
}
