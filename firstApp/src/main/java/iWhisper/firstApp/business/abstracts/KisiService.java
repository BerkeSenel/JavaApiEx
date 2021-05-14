package iWhisper.firstApp.business.abstracts;

import java.util.List;

import iWhisper.firstApp.entities.concretes.Kisi;


public interface KisiService {
	String getWordForKisi(int id);
	List<Kisi> getAllKisi();
}
