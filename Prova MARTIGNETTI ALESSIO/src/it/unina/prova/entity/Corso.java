package it.unina.prova.entity;

import java.util.ArrayList;

public class Corso {

	private int nextIDAppello = 1; //gli appelli sono numerati per corso. Ogni corso ha appello1, appello2...
	private String codiceCorso;
	private String nome;
	private int crediti;
	private Docente docente;
	private ArrayList<Appello> appelli;

	public Corso(String codiceCorso, String nome, int crediti, Docente d) {
		this.codiceCorso = codiceCorso;
		this.nome = nome;
		this.crediti = crediti;
		this.docente = d;
		this.appelli = new ArrayList<Appello>();
	}
	
	public int aggiungiAppello(int year, int month, int day, String luogo, TipoProva tipo) {
		Appello nuovoAppello = new Appello(nextIDAppello,year,month,day,luogo,tipo);
		++nextIDAppello;
		appelli.add(nuovoAppello);
		return nuovoAppello.getId(); //ritorna id appello creato
	}
	
	public void aggiungiData(int year, int month, int day, String luogo, TipoProva tipo, int idAppello) {
		for (Appello a : appelli) {
			if (a.getId() == idAppello) {
				a.aggiungiData(year, month, day, luogo, tipo);
			}
		}
	}

	public String getCodiceCorso() {
		return codiceCorso;
	}

	public void setCodiceCorso(String codiceCorso) {
		this.codiceCorso = codiceCorso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCrediti() {
		return crediti;
	}

	public void setCrediti(int crediti) {
		this.crediti = crediti;
	}
	
	public Docente getDocente() {
		return docente;
	}

	public void setDocente(Docente docente) {
		this.docente = docente;
	}

	public ArrayList<Appello> getAppelli() {
		return appelli;
	}

	public void setAppelli(ArrayList<Appello> appelli) {
		this.appelli = appelli;
	}

	public String toString() {
		return codiceCorso + " " + nome + " " + crediti + "CFU";
	}

}
