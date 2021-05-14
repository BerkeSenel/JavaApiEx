package iWhisper.firstApp.dataAccess.concretes;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import iWhisper.firstApp.dataAccess.abstracts.ZamanDao;
import iWhisper.firstApp.entities.concretes.Zaman;

@Repository
public class ZamanDaoIMP implements ZamanDao {
	
	private final EntityManager entityManager;
	
	
	public ZamanDaoIMP(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}


	@Override
	public String getWordForZaman(int id) {
		Session session = entityManager.unwrap(Session.class);
		Zaman zaman = session.createQuery("from Zaman k where k.id=:id",Zaman.class)
                .setParameter("id",id)
                .getSingleResult();
        return zaman.getWord();
	}

}

