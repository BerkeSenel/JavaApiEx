package iWhisper.firstApp.business.concretes;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import iWhisper.firstApp.business.abstracts.AgriService;

import iWhisper.firstApp.dataAccess.abstracts.AgriDao;
import iWhisper.firstApp.dataAccess.abstracts.AgriDaoJPA;
import iWhisper.firstApp.entities.concretes.Agri;

@Service
public class AgriServiceIMP implements AgriService{

	private AgriDaoJPA agriDaoJPA;
	private AgriDao agriDaoOwn;
	
	
	@Autowired
	public AgriServiceIMP(AgriDaoJPA agriDaoJPA,AgriDao agriDaoOwn) {
		super();
		this.agriDaoJPA = agriDaoJPA;
		this.agriDaoOwn = agriDaoOwn;
	}

	
	@Override
	public String getWordForAgri(int id) {
	
		return this.agriDaoOwn.getWordForAgri(id);
	}


	@Override
	public List<Agri> getAllAgri() {
		return agriDaoJPA.findAll();
	}
	
	


	
	
}