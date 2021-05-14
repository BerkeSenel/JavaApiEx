package iWhisper.firstApp.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import iWhisper.firstApp.business.abstracts.IsteklerService;
import iWhisper.firstApp.entities.concretes.Istekler;

@RestController
@RequestMapping("/api/istek")
public class IsteklerController {
	
	private IsteklerService isteklerService;

	public IsteklerController(IsteklerService isteklerService) {
		super();
		this.isteklerService = isteklerService;
	}
	
	@GetMapping("/{id}")
	public String getWordForIstekler(@PathVariable int id) {
		return this.isteklerService.getWordForIstekler(id);
	}
	
	
	@GetMapping("")
	public List<Istekler> getAllIstekler(){
		return isteklerService.getAllIstekler();
	}
	
}
