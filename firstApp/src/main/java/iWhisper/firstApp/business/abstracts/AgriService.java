package iWhisper.firstApp.business.abstracts;

import java.util.List;

import iWhisper.firstApp.entities.concretes.Agri;

public interface AgriService {
	String getWordForAgri(int id);
	List<Agri> getAllAgri();
}
