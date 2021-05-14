package iWhisper.firstApp.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import iWhisper.firstApp.business.abstracts.IsteklerService;
import iWhisper.firstApp.dataAccess.abstracts.IsteklerDao;
import iWhisper.firstApp.dataAccess.abstracts.IsteklerDaoJPA;
import iWhisper.firstApp.entities.concretes.Istekler;

@Service
public class IsteklerServiceIMP implements IsteklerService{
	
	private IsteklerDaoJPA isteklerDaoJPA;
	private IsteklerDao isteklerDao;
	
	
	@Autowired
	public IsteklerServiceIMP(IsteklerDaoJPA isteklerDaoJPA, IsteklerDao isteklerDao) {
		super();
		this.isteklerDaoJPA = isteklerDaoJPA;
		this.isteklerDao = isteklerDao;
	}



	@Override
	public String getWordForIstekler(int id) {
		return this.isteklerDao.getWordForIstekler(id);
	}



	@Override
	public List<Istekler> getAllIstekler() {
		return this.isteklerDaoJPA.findAll();
	}

}
