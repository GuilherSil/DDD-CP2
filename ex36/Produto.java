package ex36;

public class Produto {
	private int id;
	private String nome;
	private Double preco;
	private Double quantidade;
	private Categoria categoria;
	
	public int getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public Double getPreco() {
		return preco;
	}
	
	public Double getQuantidade() {
		return quantidade;
	}
	
	public Categoria getCategoria() {
		return categoria;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}
	
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
	
	Produto(){
		
	}
	
	Produto(int id, String nome, Double preco, Double quantidade, Categoria categoria){
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		this.categoria = categoria;
	}
	
	public String exibirNomePreco() {
		return this.nome + " - R$" + this.preco;
	}
	
	public String exibirNomeQuantidade() {
		return this.nome + " - Quantidade: " + this.quantidade;
	}
	
	
}
