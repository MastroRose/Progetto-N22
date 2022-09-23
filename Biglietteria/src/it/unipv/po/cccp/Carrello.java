package it.unipv.po.cccp;
import java.util.List;

import it.unipv.po.ticket.cus.Sessione;

public class Carrello implements ICarrello {
	Sessione s;
	List<Titolo> lista;
	
	@Override
	public void inizializza(Sessione s) {
		this.s=s;
		
	}

	@Override
	public void aggiungiTitolo(Titolo t) {
		lista.add(t);
		
	}

	@Override
	public void rimuoviTitolo(Titolo t) {
		lista.remove(t);
		
	}

	@Override
	public List<Titolo> getTitoli() {
		return lista;
	}

	@Override
	public void clearAll() {
		lista.clear();
		
	}

	@Override
	public double getTotale(int punti) {
		double tot=0;
		for(int i=0; i<lista.size();i++)
			tot += lista.get(i).getPrezzo();
		tot -= punti/10;
		return tot;
	}

	@Override
	public void aggiornaCronologia() {
		
		
	}

	
	
	
}
