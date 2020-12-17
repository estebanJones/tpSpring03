package bounceevent.builder;

import org.springframework.stereotype.Component;

import bounceevent.entites.Adresse;
import bounceevent.entites.Producteur;

@Component
public class ProducteurBuilder {
private Producteur producteur;
	
	public ProducteurBuilder() {
		// TODO Auto-generated constructor stub
	}
	
	public Producteur build(String  nom, String prenom, Double salaire, Adresse  adresse) {
		this.createProducteur(nom, prenom, salaire);
		this.appendAdresse(adresse);
		return this.get();
	}
	public void createProducteur(String nom, String prenom, Double budget) {
		this.producteur = new  Producteur(nom, prenom, budget);
	}
	
	public void appendAdresse(Adresse  adresse) {
		this.producteur.setAdresse(adresse);
	}
	
	private Producteur get() {
		return this.producteur;
	}
}
