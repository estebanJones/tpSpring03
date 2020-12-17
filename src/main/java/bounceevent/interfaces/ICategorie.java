package bounceevent.interfaces;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import bounceevent.entites.Categorie;

public interface ICategorie extends JpaRepository<Categorie, Integer> {
	public Optional<List<Categorie>> findByDateMaj(Date date);
}
