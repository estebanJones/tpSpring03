package bounceevent.entites;

import javax.persistence.Entity;

@Entity
public class Realisateur extends Intervenant {
	private Double commission;

	public Realisateur(String nom, String prenom,Double commission) {
		super(nom, prenom);
		this.commission = commission;
	}
	
	public Realisateur() {
		// TODO Auto-generated constructor stub
	}
	
	public Double getCommission() {
		return commission;
	}

	public void setCommission(Double commission) {
		this.commission = commission;
	}

}
