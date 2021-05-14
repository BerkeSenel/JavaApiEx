package iWhisper.firstApp.business.abstracts;

import java.util.List;

import iWhisper.firstApp.entities.concretes.Zaman;

public interface ZamanService {
	String getWordForZaman(int id);
	List<Zaman> getAllZaman();
}
