package bounceevent.services;

import java.util.Date;

import org.springframework.stereotype.Service;

import bounceevent.builder.ActeurBuilder;
import bounceevent.builder.ProducteurBuilder;
import bounceevent.builder.RealisateurBuilder;
import bounceevent.entites.Acteur;
import bounceevent.entites.Adresse;
import bounceevent.entites.Categorie;
import bounceevent.entites.Film;
import bounceevent.entites.Producteur;
import bounceevent.entites.Realisateur;
import bounceevent.entites.Tache;
import bounceevent.entites.TacheDatee;
import bounceevent.interfaces.IActeur;
import bounceevent.interfaces.IAdresse;
import bounceevent.interfaces.ICategorie;
import bounceevent.interfaces.IFilm;
import bounceevent.interfaces.IProducteur;
import bounceevent.interfaces.IRealisateur;
import bounceevent.interfaces.ITache;

@Service
public class FilmService {
	private ActeurBuilder acteurBuilder;
	private ProducteurBuilder producteurBuilder;
	private RealisateurBuilder realisateurBuilder;
	private IFilm ifilm;
	private IAdresse iadresse;
	private ICategorie icategorie;
	private IActeur iacteur;
	private IRealisateur irealisateur;
	private IProducteur iproducteur;
	private ITache itache;
	
	
	public FilmService(IFilm ifilm, IAdresse iadresse, ICategorie icategorie, IActeur iacteur, IRealisateur irealisateur, IProducteur iproducteur, ITache itache,
			ActeurBuilder acteurBuilder, ProducteurBuilder producteurBuilder) {
		this.ifilm = ifilm;
		this.iadresse = iadresse;
		this.icategorie = icategorie;
		this.iacteur = iacteur;
		this.irealisateur = irealisateur;
		this.iproducteur = iproducteur;
		this.itache = itache;
		this.acteurBuilder = acteurBuilder;
		this.producteurBuilder = producteurBuilder;
	}
	
	public void insert() {
		Categorie categorie =  new Categorie("bimbim", new Date());
		this.icategorie.save(categorie);
		
		Film film = new Film("La  haine", "1995");
		film.setCategorie(categorie);
		
		Adresse  adresse1  = new  Adresse(1, "libelle1", "ville1", 30601);
		Adresse  adresse2  = new  Adresse(2, "libelle2", "ville2", 30602);
		Adresse  adresse3  = new  Adresse(3, "libelle3", "ville3", 30603);
		Adresse  adresse4  = new  Adresse(4, "libelle4", "ville4", 30604);
		Adresse  adresse5  = new  Adresse(7, "libelle5", "ville5", 30605);
		this.iadresse.save(adresse1);
		this.iadresse.save(adresse2);
		this.iadresse.save(adresse3);
		this.iadresse.save(adresse4);
		this.iadresse.save(adresse5);
		
		Acteur acteur1 = this.acteurBuilder.build("Jones", "Esteban", "monAgence", 4000.0, adresse1);
		Acteur acteur2 = this.acteurBuilder.build("Tic", "Tac", "monAgence", 1000.0, adresse2);
		Acteur acteur3 = this.acteurBuilder.build("Mayweather", "Floyd", "monneyTeam", 3000.0, adresse3);
		Realisateur realisateur = this.realisateurBuilder.build("Spielb", "Stev", 10.0, adresse4);
		Producteur producteur = this.producteurBuilder.build("Homme", "Fantome", 200_000.0, adresse5);
		
		
		this.iacteur.save(acteur1);
		this.iacteur.save(acteur2);
		this.iacteur.save(acteur3);
		this.irealisateur.save(realisateur);
		this.iproducteur.save(producteur);
		
		Tache tache1 = new  Tache("descirption1", new  Date());
		Tache tache2 = new  TacheDatee("descirption1", new  Date(), new  Date());
		tache1.setIntervenant(producteur);
		tache2.setIntervenant(producteur);
		
		this.itache.save(tache1);
		this.itache.save(tache2);
		
		film.addIntervenant(acteur1);
		film.addIntervenant(acteur2);
		film.addIntervenant(acteur3);
		film.addIntervenant(realisateur);
		film.addIntervenant(producteur);
		this.ifilm.save(film);
	}
}
