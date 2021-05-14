package iWhisper.firstApp.dataAccess.concretes;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import iWhisper.firstApp.dataAccess.abstracts.IsteklerDao;
import iWhisper.firstApp.entities.concretes.Istekler;


@Repository
public class IsteklerDaoIMP implements IsteklerDao {
	
	private final EntityManager entityManager;
	
	
	public IsteklerDaoIMP(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}



	@Override
	public String getWordForIstekler(int id) {
		Session session = entityManager.unwrap(Session.class);
		Istekler istekler = session.createQuery("from Istekler i where i.id=:id",Istekler.class)
				.setParameter("id",id)
                .getSingleResult();
		return istekler.getWord();
	}

}
