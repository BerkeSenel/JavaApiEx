package iWhisper.firstApp.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import iWhisper.firstApp.entities.concretes.Zaman;

public interface ZamanDaoJPA extends JpaRepository<Zaman,Integer> {

}
