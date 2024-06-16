package Model;

import java.time.LocalDate;

/*Scrivere una classe “Recensione” che contiene i seguenti attributi:
LocalDate data String nomeUtente int numeroStelle String testo
e opportuni metodi costruttore, getters, setters, facendo in modo che non si possa creare un’istanza non valida di Recensione (ad esempio il numero di stelle deve essere compreso tra 1 e 5)*/


public class Recensione {
//dichiaro le variabili private della classe
	private LocalDate data;
	private String nomeUtente;
	private int numeroStelle;
	private String testo;
	
//costruttore + controllo validità
	public Recensione  (LocalDate data, String nomeUtente, int numeroStelle, String testo) throws Exception {
		
		if (data==null) {
			throw new Exception ("data non valida");
		} else {
			this.data = data;
		}
		if (!nomeUtente.isEmpty()) {
			this.nomeUtente = nomeUtente;
		} else {
			throw new Exception ("nome utente non valido");
		}
		if (numeroStelle<1 || numeroStelle>5) {
			throw new Exception("il numero di stelle deve essere compreso tra 1 e 5");
		} else {
			this.numeroStelle = numeroStelle;
		}
		if (!testo.isEmpty()) {
			this.testo = testo;
		} else {
			throw new Exception ("testo non valido");
		}
	}
	//Getters and Setters
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	public String getNomeUtente () {
		return nomeUtente;
	}
	public void setNomeUtente(String nomeUtente) {
		this.nomeUtente = nomeUtente;
	}
	public int getNumeroStelle() {
		return numeroStelle;
	}
	public void setNumeroStelle(int numeroStelle) {
		this.numeroStelle=numeroStelle;
	}
	public String getTesto() {
		return testo;
	}
	public void setTesto(String testo) {
		this.testo = testo;
	}
}
