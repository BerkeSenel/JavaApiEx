package iWhisper.firstApp.dataAccess.concretes;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import iWhisper.firstApp.dataAccess.abstracts.KisiDao;
import iWhisper.firstApp.entities.concretes.Kisi;

@Repository
public class KisiDaoIMP implements KisiDao {
	
	private final EntityManager entityManager;
	
	
	public KisiDaoIMP(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}


	@Override
	public String getWordForKisi(int id) {
		Session session = entityManager.unwrap(Session.class);
		Kisi kisi = session.createQuery("from Kisi k where k.id=:id",Kisi.class)
                .setParameter("id",id)
                .getSingleResult();
        return kisi.getWord();
	}

}

