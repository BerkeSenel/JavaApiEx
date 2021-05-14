package iWhisper.firstApp.business.abstracts;

import java.util.List;
import iWhisper.firstApp.entities.concretes.Istekler;

public interface IsteklerService {
	String getWordForIstekler(int id);
	List<Istekler> getAllIstekler();
}
