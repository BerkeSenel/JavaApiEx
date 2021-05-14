package iWhisper.firstApp.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;


import iWhisper.firstApp.entities.concretes.Istekler;

public interface IsteklerDaoJPA extends JpaRepository<Istekler,Integer>{

}
