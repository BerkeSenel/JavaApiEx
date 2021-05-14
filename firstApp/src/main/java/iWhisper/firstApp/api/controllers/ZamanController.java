package iWhisper.firstApp.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import iWhisper.firstApp.business.abstracts.ZamanService;
import iWhisper.firstApp.entities.concretes.Zaman;

@RestController
@RequestMapping("/api/zaman")
public class ZamanController {
	
	private ZamanService zamanService;

	public ZamanController(ZamanService zamanService) {
		super();
		this.zamanService = zamanService;
	}
	
	@GetMapping("/{id}")
	public String getWordForZaman(@PathVariable int id) {
		return this.zamanService.getWordForZaman(id);
	}
	
	@GetMapping("")
	public List<Zaman> getAllZaman(){
		return zamanService.getAllZaman();
	}

}
