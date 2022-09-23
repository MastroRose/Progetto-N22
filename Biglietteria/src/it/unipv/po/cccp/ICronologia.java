package it.unipv.po.cccp;
import java.util.List;

public interface ICronologia {
	public void cancella();
	public void aggiungiCarrello(List<Titolo> l);
	public void rimuoviCarrello(Titolo t);
	
}
