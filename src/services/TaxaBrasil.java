package services;

public class TaxaBrasil implements TaxaServico{
	public double taxa(double taxa) {
		double t = (taxa > 100.00) ? taxa*0.15 : taxa*0.20;
		
		return t;
	}
}
