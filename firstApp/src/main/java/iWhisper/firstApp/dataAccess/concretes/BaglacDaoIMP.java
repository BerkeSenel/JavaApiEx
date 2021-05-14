package iWhisper.firstApp.dataAccess.concretes;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import iWhisper.firstApp.dataAccess.abstracts.BaglacDao;
import iWhisper.firstApp.entities.concretes.Baglac;


@Repository
public class BaglacDaoIMP implements BaglacDao{
	
	private final EntityManager entityManager;
	
	
	
	public BaglacDaoIMP(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}



	@Override
	public String getWordForBaglac(int id) {
		Session session = entityManager.unwrap(Session.class);
		Baglac baglac = session.createQuery("from Baglac b where b.id=:id",Baglac.class)
                .setParameter("id",id)
                .getSingleResult();
        return baglac.getWord();
	}

}
