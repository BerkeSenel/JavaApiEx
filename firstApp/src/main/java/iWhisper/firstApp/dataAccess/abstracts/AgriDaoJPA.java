package iWhisper.firstApp.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import iWhisper.firstApp.entities.concretes.Agri;

public interface AgriDaoJPA extends JpaRepository<Agri,Integer>{
	
}