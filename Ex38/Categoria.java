package Ex38;

public class Categoria {
	private int id;
	private String nome;
	
	public int getIdCategoria() {
		return id;
	}
	
	public String getNomeCategoria() {
		return nome;
	}
	
	public void setIdCategoria(int id) {
		this.id = id;
	}
	
	public void setNomeCategoria(String nome) {
		this.nome = nome;
	}
	
	
	Categoria() {
		
	}
	
	Categoria(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}
}
