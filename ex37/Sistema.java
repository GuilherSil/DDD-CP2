package ex37;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;


public class Sistema {

	public static void main(String[] args) throws IOException{
		
		
		Scanner ler = new Scanner(System.in);
	
		ArrayList<Cliente> listaClientes = new ArrayList<>();
		
		
		String nome, email, agencia, numero;
		int idade, opcao, id;
		double saldo;
		char possuiContaBancaria;
		ContaBancaria conta;
		
		
		System.out.printf("!--- Sistema de Cadastro de Clientes ---!\n\n");
		do {
			System.out.printf("Suas opções: \n" +
							  "1- Incluir Cliente. \n" +
							  "2- Alterar dados do Cliente.\n" +
							  "3- Excluir Cliente. \n" +
							  "4- Exibir dados do Cliente.\n" +
							  "5- Sair.\n\n");
			
			System.out.printf("Digite a opção desejada: ");
			opcao = ler.nextInt();
			
				if (opcao == 1) {
					Cliente cliente = new Cliente();
					
					id = listaClientes.size() + 1;
					cliente.setId(id);
					
					System.out.printf("Digite o nome do Cliente: ");
					nome = ler.next();
					cliente.setNome(nome);
					
					System.out.printf("Digite a idade do Cliente: ");
					idade = ler.nextInt();
					cliente.setIdade(idade);
					
					System.out.printf("Digite o email do Cliente: ");
					email = ler.next();
					cliente.setEmail(email);
					
					System.out.printf("Possui conta bancária? (S/N): ");
					possuiContaBancaria = ler.next().charAt(0);
					
					if (possuiContaBancaria == 'S') {
						ContaBancaria ct = new ContaBancaria();
						
						System.out.printf("Digite a agência da conta: ");
						agencia = ler.next();
						ct.setAgencia(agencia);
						
						System.out.printf("Digite o número da conta: ");
						numero = ler.next();
						ct.setNumero(numero);
						
						System.out.printf("Digite o saldo da conta: ");
						saldo = ler.nextDouble();
						ct.setSaldo(saldo);
						
						conta = ct;
					}
					else {
						conta = null;
					}
					
					listaClientes.add(cliente);
					
					System.out.printf("\n!--- Cliente incluído com sucesso! ---!\n");
					System.in.read();
					
				}
				else if (opcao == 2) {
					for(Cliente a: listaClientes) {
						System.out.printf("ID: %d - Nome: %s - Idade: %d - Email: %s - ", a.getId(), a.getNome(), a.getIdade(), a.getEmail());
					}
					
					System.out.printf("\nDigite o ID do cliente que deseja atualizar: ");
					id = ler.nextInt();
					
					System.out.printf("Digite o nome do Cliente: ");
					nome = ler.next();
					
					System.out.printf("Digite a idade do Cliente: ");
					idade = ler.nextInt();
					
					System.out.printf("Digite o email do Cliente: ");
					email = ler.next();
					
					Cliente cliente = listaClientes.get(id-1);
					
					cliente.setNome(nome);
					cliente.setIdade(idade);
					cliente.setEmail(email);
					
					System.out.printf("Cliente atualizado com sucesso!");
					System.in.read();
				}
				else if (opcao == 3) {
					for(Cliente a: listaClientes) {
						System.out.printf("ID: %d - Nome: %s - Idade: %d - Email: %s - ", a.getId(), a.getNome(), a.getIdade(), a.getEmail());
					}
					
					System.out.printf("\nDigite o id do cliente que deseja excluir: ");
	                id = ler.nextInt();
	 
	                listaClientes.remove(id-1);
	               
	                System.out.printf("Cliente excluído com sucesso!");
	                System.in.read();
				}
				else if (opcao == 4) {
					for(Cliente a: listaClientes) {
						System.out.printf("ID: %d - Nome: %s - Idade: %d - Email: %s - ", a.getId(), a.getNome(), a.getIdade(), a.getEmail());
						System.out.printf("\n%s", a.exibirDadosConta());
					}
					
					System.in.read();
				}
		}while(opcao !=5);
		
		
}
}
