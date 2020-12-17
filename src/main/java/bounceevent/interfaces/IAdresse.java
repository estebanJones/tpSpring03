package bounceevent.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import bounceevent.entites.Adresse;

public interface IAdresse extends JpaRepository<Adresse, Integer> {

}
