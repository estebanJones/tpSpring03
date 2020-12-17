package bounceevent.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import bounceevent.services.FilmService;

@RestController
public class MainController {
	private FilmService filmService;
	public MainController(FilmService filmService) {
		this.filmService = filmService;
	}
	@GetMapping("/tp")
	public void getTp() {
		this.filmService.insert();
	}
}
