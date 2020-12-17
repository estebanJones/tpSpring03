package bounceevent.entites;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Film {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String titre;
	private String anneeSortie;
	
	@ManyToOne
	@JoinColumn(name="categorie_id")
	private Categorie categorie;
	
	@ManyToMany
	@JoinTable(name = "film_intervenant", joinColumns = @JoinColumn(name="id_film",  referencedColumnName = "id"),
	inverseJoinColumns = @JoinColumn(name="id_intervenant", referencedColumnName = "id")
	) 
	Set<Intervenant> intervenants = new HashSet<>();
	
	public Film() {
		// TODO Auto-generated constructor stub
	}
	
	public Film(String titre, String anneeSortie) {
		this.titre = titre;
		this.anneeSortie = anneeSortie;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAnneeSortie() {
		return anneeSortie;
	}

	public void setAnneeSortie(String anneeSortie) {
		this.anneeSortie = anneeSortie;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public Set<Intervenant> getIntervenants() {
		return intervenants;
	}

	public void setIntervenants(Set<Intervenant> intervenants) {
		this.intervenants = intervenants;
	}
	
	public void addIntervenant(Intervenant  intervenant) {
		this.intervenants.add(intervenant);
	}
}
