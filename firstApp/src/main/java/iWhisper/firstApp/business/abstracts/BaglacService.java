package iWhisper.firstApp.business.abstracts;

import java.util.List;

import iWhisper.firstApp.entities.concretes.Baglac;

public interface BaglacService {
	String getWordForBaglac(int id);
	List<Baglac> getAllBaglac();
}
