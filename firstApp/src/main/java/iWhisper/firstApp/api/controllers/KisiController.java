package iWhisper.firstApp.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import iWhisper.firstApp.business.abstracts.KisiService;
import iWhisper.firstApp.entities.concretes.Kisi;

@RestController
@RequestMapping("/api/kisi")
public class KisiController {
	
	private KisiService kisiService;

	public KisiController(KisiService kisiService) {
		super();
		this.kisiService = kisiService;
	}
	
	@GetMapping("/{id}")
	public String getWordForKisi(@PathVariable int id) {
		return this.kisiService.getWordForKisi(id);
	}
	
	@GetMapping("")
	public List<Kisi> getAllKisi(){
		return kisiService.getAllKisi();
	}
	

}
