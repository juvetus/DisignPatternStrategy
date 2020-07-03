package fr.doranco.disign.pattern.strategy;

public class BitcoinStrategy implements PaiementStrategy{
	
	private String idPortefeuille;
	private String password;
	
	
	
	public BitcoinStrategy(String idPortefeuille, String password) {
		super();
		this.idPortefeuille = idPortefeuille;
		this.password = password;
	}



	@Override
	public void payer(int montant) {
		System.out.println(montant + "  BTC payés par Bitcoin.");
		
	}
	
	

}
