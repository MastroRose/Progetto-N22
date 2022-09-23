package it.unipv.po.cccp;
import java.util.List;

import it.unipv.po.ticket.cus.Sessione;

public interface ICarrello {
	public void inizializza(Sessione s);
	public void aggiungiTitolo(Titolo t);
	public void rimuoviTitolo(Titolo t);
	public List<Titolo> getTitoli();
	public void clearAll();
	public double getTotale(int punti);
	public void aggiornaCronologia();
	
}
