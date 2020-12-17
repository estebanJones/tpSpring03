package bounceevent.builder;

import org.springframework.stereotype.Component;

import bounceevent.entites.Acteur;
import bounceevent.entites.Adresse;

@Component
public class ActeurBuilder {
	private Acteur acteur;
	
	public ActeurBuilder() {
		// TODO Auto-generated constructor stub
	}
	
	public Acteur build(String  nom, String prenom, String agence, Double salaire, Adresse  adresse) {
		this.createActeur(nom, prenom, agence, salaire);
		this.appendAdresse(adresse);
		return this.get();
	}
	public void createActeur(String  nom, String prenom, String agence, Double salaire) {
		this.acteur = new  Acteur(nom, prenom, agence, salaire);
	}
	
	public void appendAdresse(Adresse  adresse) {
		this.acteur.setAdresse(adresse);
	}
	
	private Acteur get() {
		return this.acteur;
	}
}
