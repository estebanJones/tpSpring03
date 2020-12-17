package bounceevent.entites;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Intervenant {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Integer id;
	private String nom;
	private String prenom;
	
	@OneToOne
	private Adresse adresse;
	
	@OneToMany(mappedBy = "intervenant")
	private Set<Tache> taches = new HashSet<>();;
	
	@ManyToMany
	@JoinTable(name = "film_intervenant", joinColumns = @JoinColumn(name="id_intervenant",  referencedColumnName = "id"),
	inverseJoinColumns = @JoinColumn(name="id_film", referencedColumnName = "id")
	) 
	private Set<Film> films = new  HashSet<>();;
	
	public Intervenant(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public Intervenant() {
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

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public Set<Film> getFilms() {
		return films;
	}

	public void setFilms(Set<Film> films) {
		this.films = films;
	}

	public Set<Tache> getTaches() {
		return taches;
	}

	public void setTaches(Set<Tache> taches) {
		this.taches = taches;
	}

	public  void addTache(Tache tache) {
		this.taches.add(tache);
	}
	
	public void addFilm(Film film) {
		this.films.add(film);
	}
}
