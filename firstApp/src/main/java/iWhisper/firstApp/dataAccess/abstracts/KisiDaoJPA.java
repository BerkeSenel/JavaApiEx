package iWhisper.firstApp.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import iWhisper.firstApp.entities.concretes.Kisi;

public interface KisiDaoJPA extends JpaRepository<Kisi,Integer>{

}
