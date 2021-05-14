package iWhisper.firstApp.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import iWhisper.firstApp.business.abstracts.BaglacService;
import iWhisper.firstApp.entities.concretes.Baglac;

@RestController
@RequestMapping("/api/baglac")
public class BaglacController {
	
	private BaglacService baglacService;

	public BaglacController(BaglacService baglacService) {
		super();
		this.baglacService = baglacService;
	}
	
	@GetMapping("/{id}")
	public String getWordForBaglac(@PathVariable int id){
		return baglacService.getWordForBaglac(id);
	}
	
	@GetMapping("")
	public List<Baglac> getAllBaglac(){
		return baglacService.getAllBaglac();
	}
	
	
	
}
