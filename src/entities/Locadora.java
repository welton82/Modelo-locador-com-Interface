package entities;

import java.util.Date;

public class Locadora {
	private Date inicioLocacao;
	private Date fimLocacao;
	
	private Carro carro;
	private Pagamento pagamento;
	public Locadora() {
		
	}
	public Locadora(Date inicioLocacao, Date fimLocacao, Carro carro) {
		//super();
		this.inicioLocacao = inicioLocacao;
		this.fimLocacao = fimLocacao;
		this.carro = carro;
	}
	public Date getInicioLocacao() {
		return inicioLocacao;
	}
	public void setInicioLocacao(Date inicioLocacao) {
		this.inicioLocacao = inicioLocacao;
	}
	public Date getFimLocacao() {
		return fimLocacao;
	}
	public void setFimLocacao(Date fimLocacao) {
		this.fimLocacao = fimLocacao;
	}
	public Carro getCarro() {
		return carro;
	}
	public void setCarro(Carro carro) {
		this.carro = carro;
	}
	public Pagamento getPagamento() {
		return pagamento;
	}
	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}
	
	
	
}
