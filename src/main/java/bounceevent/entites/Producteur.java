package bounceevent.entites;

import javax.persistence.Entity;

@Entity
public class Producteur extends Intervenant {
	private Double budget;

	public Producteur(String nom, String prenom, Double budget) {
		super(nom, prenom);
		this.budget = budget;
	}
	
	public Producteur() {
		// TODO Auto-generated constructor stub
	}

	public Double getBudget() {
		return budget;
	}

	public void setBudget(Double budget) {
		this.budget = budget;
	}
}
