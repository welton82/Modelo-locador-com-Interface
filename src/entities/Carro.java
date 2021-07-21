package entities;

public class Carro {
	
	private String nome;
	private String placa;
	
	public Carro() {
		
	}
	public Carro(String nome, String placa) {
		super();
		this.nome = nome;
		this.placa = placa;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	
	
	
}
