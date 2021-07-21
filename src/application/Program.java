package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Carro;
import entities.Locadora;
import services.Servico;
import services.TaxaBrasil;

public class Program {
	public static void main(String[] args) throws Exception {
		
		Scanner scan = new Scanner(System.in);
		menu(scan);
		
	}
	public static void menu(Scanner scan) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
		System.out.print("Informe o modelo Veiculo: ");
		String modelo = scan.nextLine();
		System.out.print("Informe a Placa: ");
		String placa = scan.next();
		Carro carro = new Carro(modelo.toUpperCase(),placa.toUpperCase());
		scan.nextLine();
		
		System.out.print("Informe a Data da locação (dd/MM/yyyy HH:ss): ");
		String dtIn = scan.nextLine();
		System.out.print("Informe a Data de Entrega Veicular(dd/MM/yyyy HH:ss): ");
		String dtFn = scan.nextLine();
		Date in = sdf.parse(dtIn);
		Date fn = sdf.parse(dtFn);
		Locadora locadora = new Locadora(in, fn, carro);
		
		System.out.print("Entre com o Preço por Hora: ");
		double pHora = scan.nextDouble();
		System.out.print("Entre com o Preço por Dia: ");
		double pDia = scan.nextDouble();
		
		
		TaxaBrasil txBrasil = new TaxaBrasil();
		Servico servico = new Servico(pHora, pDia, txBrasil);
		//ou Servico servico = new Servico(pHora, pDia, new TaxaBrasil());
		servico.gerarNota(locadora);
		
		System.out.println("========================= Pagamento ====================================");
		System.out.println("|\t" + "Modelo do Carro: " + locadora.getCarro().getNome() + "\t\t\t\t\t\t|");
		System.out.println("|\t" + "Placa: " + locadora.getCarro().getPlaca() + "\t\t\t\t\t\t\t|");
		System.out.println("|\t" + "Data de Locação: " + locadora.getInicioLocacao() + "\t\t\t|");
		System.out.println("|\t" + "Data Entrega Veicular: " + locadora.getFimLocacao() + "\t\t|");
		System.out.println("|\t" + "Taxa de Juros: " + String.format("%.2f",locadora.getPagamento().getTaxa()) + "\t\t\t\t\t\t|");
		System.out.println("|\t" + "Valor do Pagamento Basico: " + String.format("%.2f", locadora.getPagamento().getPagamentoBasico())+ "\t\t\t\t|");
		System.out.println("|\t" + "Valor Total do Pagamento: " + String.format("%.2f",locadora.getPagamento().total())+ "\t\t\t\t|");
		System.out.println("|_______________________________________________________________________|");
		
	}
	
}
//Data Entrega Veicular: Thu Jul 22 17:28:00 BRT 2021		