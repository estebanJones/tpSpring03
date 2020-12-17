package bounceevent.entites;

import javax.persistence.Entity;

@Entity
public class Acteur extends Intervenant {
	private String agence;
	private Double salaire;
	
	public Acteur(String nom, String prenom,String agence, Double salaire) {
		super(nom,prenom);
		this.agence = agence;
		this.salaire = salaire;
	}
	
	public Acteur() {
		// TODO Auto-generated constructor stub
	}
	
	public String getAgence() {
		return agence;
	}

	public void setAgence(String agence) {
		this.agence = agence;
	}

	public Double getSalaire() {
		return salaire;
	}

	public void setSalaire(Double salaire) {
		this.salaire = salaire;
	}
	
	
}
