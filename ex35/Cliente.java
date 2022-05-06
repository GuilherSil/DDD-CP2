package ex35;

public class Cliente {
	private int id;
	private String nome;
	private int idade;
	private String email;
	private ContaBancaria conta;
	
	public int getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public String getEmail() {
		return email;
	}
	
	public ContaBancaria getConta() {
		return conta;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setContaBancaria(ContaBancaria conta) {
		this.conta = conta;
	}


	Cliente(){
		
	}
	
	Cliente(int id, String nome, int idade, String email, ContaBancaria conta) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.email = email;
		this.conta = conta;
	}
	
	public void atualizarEmail(String novoEmail) {
		this.email = novoEmail;
	}
	
	public String exibirNomeIdade() {
		return this.nome + " - " + this.idade;
	}
	
	public String exibirDadosConta() {
		if(this.conta != null) 
			return "Ag: " + this.conta.getAgencia() + "\nNum: " + this.conta.getNumero();
		else
			return "Não tem conta!";
	}
}
