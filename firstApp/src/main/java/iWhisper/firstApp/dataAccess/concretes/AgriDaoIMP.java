package iWhisper.firstApp.dataAccess.concretes;


import javax.persistence.EntityManager;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;




import iWhisper.firstApp.dataAccess.abstracts.AgriDao;
import iWhisper.firstApp.entities.concretes.Agri;

@Repository
public class AgriDaoIMP implements AgriDao {
	
	private final EntityManager entityManager;

    public AgriDaoIMP(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
	
	@Override
	public String getWordForAgri(int id) {
		Session session = entityManager.unwrap(Session.class);
        Agri agri = session.createQuery("from Agri a where a.id=:id",Agri.class)
                .setParameter("id",id)
                .getSingleResult();
        return agri.getWord();
		
	}


}