package bounceevent.interfaces;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import bounceevent.entites.Acteur;

public interface IActeur extends JpaRepository<Acteur, Integer> {
	public Optional<Acteur> findByNomAndPrenom(String nom, String prenom);
}
