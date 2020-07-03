package fr.doranco.disign.pattern.strategy;

public class Article {
	
	private String nom;
	private int prix;
	
	
	public Article(String nom, int prix) {
		super();
		this.nom = nom;
		this.prix = prix;
	}


	public String getNom() {
		return this.nom;
	}


	public int getPrix() {
		return this.prix;
	}
	
	public void payer(PaiementStrategy methodePaiement) {
		int montant = this.getPrix();
		methodePaiement.payer(montant);
		
	}
	
	
	
	

}
