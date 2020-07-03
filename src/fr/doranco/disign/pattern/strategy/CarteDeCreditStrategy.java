package fr.doranco.disign.pattern.strategy;

public class CarteDeCreditStrategy implements PaiementStrategy{
	
	private String numeroCarte;
	private String cryptogramme;
	private String dateExpiration;
	
	
	

	public CarteDeCreditStrategy(String numeroCarte, String cryptogramme, String dateExpiration) {
		super();
		this.numeroCarte = numeroCarte;
		this.cryptogramme = cryptogramme;
		this.dateExpiration = dateExpiration;
	}




	@Override
	public void payer(int montant) {
		System.out.println(montant + " € payés par Carte de Crédit.");
		
	}

}
