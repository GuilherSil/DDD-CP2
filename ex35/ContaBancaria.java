package ex35;

public class ContaBancaria {
	private String agencia;
	private String numero;
	private double saldo;
	
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public String getAgencia() {
		return agencia;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	ContaBancaria(){
		
	}
	
	ContaBancaria(String ag, String num, double sal){
		this.agencia = ag;
		this.numero = num;
		this.saldo = sal;
	}
}
