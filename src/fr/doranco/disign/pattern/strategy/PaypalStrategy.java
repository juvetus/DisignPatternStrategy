package fr.doranco.disign.pattern.strategy;

public class PaypalStrategy implements PaiementStrategy{
	
	private String email;
	private String password;
	
	

	public PaypalStrategy(String email, String password) {
	
		this.email = email;
		this.password = password;
	}



	@Override
	public void payer(int montant) {
	System.out.println(montant + " € payés par Paypal.");
		
	}

	

}
