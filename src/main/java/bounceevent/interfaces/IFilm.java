package bounceevent.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import bounceevent.entites.Film;

public interface IFilm extends JpaRepository<Film, Integer> {

}
