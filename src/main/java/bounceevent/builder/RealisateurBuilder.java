package bounceevent.builder;

import bounceevent.entites.Adresse;
import bounceevent.entites.Producteur;
import bounceevent.entites.Realisateur;

public class RealisateurBuilder {
private Realisateur realisateur;
	
	public RealisateurBuilder() {
		// TODO Auto-generated constructor stub
	}
	
	public Realisateur build(String  nom, String prenom, Double salaire, Adresse  adresse) {
		this.createRealisateur(nom, prenom, salaire);
		this.appendAdresse(adresse);
		return this.get();
	}
	public void createRealisateur(String nom, String prenom, Double commission) {
		this.realisateur = new  Realisateur(nom, prenom, commission);
	}
	
	public void appendAdresse(Adresse  adresse) {
		this.realisateur.setAdresse(adresse);
	}
	
	private Realisateur get() {
		return this.realisateur;
	}
}
