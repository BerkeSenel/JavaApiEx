package iWhisper.firstApp.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;


import iWhisper.firstApp.entities.concretes.Baglac;

public interface BaglacDaoJPA extends JpaRepository<Baglac,Integer> {

}
