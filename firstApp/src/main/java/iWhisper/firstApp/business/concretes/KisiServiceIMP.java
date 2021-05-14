package iWhisper.firstApp.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import iWhisper.firstApp.business.abstracts.KisiService;
import iWhisper.firstApp.dataAccess.abstracts.KisiDao;
import iWhisper.firstApp.dataAccess.abstracts.KisiDaoJPA;
import iWhisper.firstApp.entities.concretes.Kisi;

@Service
public class KisiServiceIMP implements KisiService{
	
	private KisiDaoJPA kisiDaoJPA;
	private KisiDao kisiDao;
	
	@Autowired
	public KisiServiceIMP(KisiDaoJPA kisiDaoJPA, KisiDao kisiDao) {
		super();
		this.kisiDaoJPA = kisiDaoJPA;
		this.kisiDao = kisiDao;
	}

	@Override
	public String getWordForKisi(int id) {
		return kisiDao.getWordForKisi(id);
	}

	@Override
	public List<Kisi> getAllKisi() {
		return this.kisiDaoJPA.findAll();
	}




}
