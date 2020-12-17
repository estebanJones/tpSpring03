package bounceevent.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import bounceevent.entites.Tache;

public interface ITache extends JpaRepository<Tache, Integer> {

}
