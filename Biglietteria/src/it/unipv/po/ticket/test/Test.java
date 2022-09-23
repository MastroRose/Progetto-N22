package it.unipv.po.ticket.test;

import it.unipv.po.ticket.DB.DBconnection;
import it.unipv.po.ticket.corsa.Corsa;
import it.unipv.po.ticket.linea.Linea;

public class Test {

	public static void main(String[] args) throws Exception {

		// ------------------------------- parte di Alessandro
		// -------------------------------------------
		// dichiarazione delle linee esistenti
		Linea prova1 = DBconnection.getLinee(1);
		Linea prova2 = DBconnection.getLinee(2);
		Linea prova3 = DBconnection.getLinee(3);
		Linea prova4 = DBconnection.getLinee(4);
		Linea prova5 = DBconnection.getLinee(5);
		Linea prova6 = DBconnection.getLinee(6);

		Corsa corsa = new Corsa();

		corsa.setCorsa(prova1);
		corsa.setCorsa(prova2);
		corsa.setCorsa(prova3);
		corsa.setCorsa(prova4);
		corsa.setCorsa(prova5);
		corsa.setCorsa(prova6);

		String partenza = "F004";
		String destinazione = "F067";

		System.out.println(corsa.cerca(partenza, destinazione));

		// ----------------------------------------------------------------------------------------------------

	}

}
