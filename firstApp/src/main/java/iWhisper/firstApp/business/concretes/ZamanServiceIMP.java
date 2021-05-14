package iWhisper.firstApp.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import iWhisper.firstApp.business.abstracts.ZamanService;
import iWhisper.firstApp.dataAccess.abstracts.ZamanDao;
import iWhisper.firstApp.dataAccess.abstracts.ZamanDaoJPA;
import iWhisper.firstApp.entities.concretes.Zaman;

@Service
public class ZamanServiceIMP implements ZamanService{
	
	private ZamanDaoJPA zamanDaoJPA;
	private ZamanDao zamanDao;
	
	@Autowired
	public ZamanServiceIMP(ZamanDaoJPA zamanDaoJPA, ZamanDao zamanDao) {
		super();
		this.zamanDaoJPA = zamanDaoJPA;
		this.zamanDao = zamanDao;
	}

	@Override
	public String getWordForZaman(int id) {
		return zamanDao.getWordForZaman(id);
	}

	@Override
	public List<Zaman> getAllZaman() {
		return this.zamanDaoJPA.findAll();
	}




}