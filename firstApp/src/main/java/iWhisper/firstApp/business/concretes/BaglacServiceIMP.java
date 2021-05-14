package iWhisper.firstApp.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import iWhisper.firstApp.business.abstracts.BaglacService;
import iWhisper.firstApp.entities.concretes.Baglac;
import iWhisper.firstApp.dataAccess.abstracts.BaglacDao;
import iWhisper.firstApp.dataAccess.abstracts.BaglacDaoJPA;

@Service
public class BaglacServiceIMP implements BaglacService {
	
	private BaglacDaoJPA baglacDaoJPA;
	private BaglacDao baglacDao;
	
	
	@Autowired
	public BaglacServiceIMP(BaglacDaoJPA baglacDaoJPA, BaglacDao baglacDao) {
		super();
		this.baglacDaoJPA = baglacDaoJPA;
		this.baglacDao = baglacDao;
	}



	@Override
	public String getWordForBaglac(int id) {
		
		return baglacDao.getWordForBaglac(id);
	}



	@Override
	public List<Baglac> getAllBaglac() {
		return baglacDaoJPA.findAll();
	}



	
	

}
