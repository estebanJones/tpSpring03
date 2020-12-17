package bounceevent.entites;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Categorie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nom;
	@Temporal(TemporalType.DATE)
	private Date dateMaj;
	
	@OneToMany(mappedBy = "categorie", fetch = FetchType.EAGER, cascade=CascadeType.REMOVE)
	private Set<Film> films = new  HashSet<>();;
	
	public Categorie(String nom, Date dateMaj) {
		this.nom = nom;
		this.dateMaj = dateMaj;
	}
	
	public Categorie() {
		// TODO Auto-generated constructor stub
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Date getDateMaj() {
		return dateMaj;
	}

	public void setDateMaj(Date dateMaj) {
		this.dateMaj = dateMaj;
	}
}
