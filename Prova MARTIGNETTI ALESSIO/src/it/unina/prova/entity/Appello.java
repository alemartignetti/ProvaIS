package it.unina.prova.entity;

import java.util.ArrayList;

public class Appello { //la classe Appello � gestita completamente dalla classe Corso.

	private int id;
	private ArrayList<DataEsame> date;
	private ArrayList<Studente> prenotati;
	
	public Appello(int id, int year, int month, int day, String luogo, TipoProva tipo) {
		this.id = id;
		date = new ArrayList<DataEsame>();
		prenotati = new ArrayList<Studente>();
		this.aggiungiData(year, month, day, luogo, tipo); //un appello ha sempre almeno una data.
	}
	
	public void aggiungiData(int year, int month, int day, String luogo, TipoProva tipo) {
		date.add(new DataEsame(year,month,day,luogo,tipo));
	}
	
	public void aggiungiStudente(Studente s) {
		prenotati.add(s);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ArrayList<DataEsame> getDate() {
		return date;
	}

	public void setDate(ArrayList<DataEsame> date) {
		this.date = date;
	}

	public ArrayList<Studente> getPrenotati() {
		return prenotati;
	}

	public void setPrenotati(ArrayList<Studente> prenotati) {
		this.prenotati = prenotati;
	}
	
	public String toString() {
		StringBuffer s = new StringBuffer();
		s.append("ID Appello: ");
		s.append(id);
		s.append("\n");
		for (DataEsame d : date) {
			s.append(d.toString());
			s.append("\n");
		}
		return s.toString();
	}

}
