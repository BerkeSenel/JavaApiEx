package iWhisper.firstApp.api.controllers;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import iWhisper.firstApp.business.abstracts.AgriService;
import iWhisper.firstApp.entities.concretes.Agri;



@RestController
@RequestMapping("/api/agri")
public class AgriController {
	
	private AgriService agriService;
	
	@Autowired
	public AgriController(AgriService agriService) {
		super();
		this.agriService = agriService;
	}
	
	@GetMapping("/{id}")
	public String getWordForAgri(@PathVariable int id){
		return agriService.getWordForAgri(id);
	}
	
	@GetMapping("")
	public List<Agri> getAllAgri(){
		return agriService.getAllAgri();
	}
	
	
}