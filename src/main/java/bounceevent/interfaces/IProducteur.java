package bounceevent.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import bounceevent.entites.Producteur;

public interface IProducteur extends JpaRepository<Producteur, Integer> {

}
