package Model;

import java.util.ArrayList;

/*Scrivere una classe MobileApp contenente i seguenti attributi:
	nome: stringa
	sistemaOperativo: stringa
	prezzo: float
	elencoRecensioni: ArrayList di Recensione ricavoTotale: float
	e i seguenti metodi:
	MobileApp(String nome, String sistemaOperativo, float prezzo)
	(costruttore della classe: inizializza gli attributi nome, sistemaOperativo, prezzo in base ai parametri passati verificando
	la validità dei parametri; inizializza elencoRecensioni,
	numeroValutazioni, ricavoTotale a 0) download():
	incrementa il ricavoTotale del valore del prezzo
	download(int numeroDownload):
	incrementa il ricavoTotale del valore del prezzo*numeroDownload
	riceviRecensione(Recensione recensione):
	l'app riceve una nuova recensione
	float valutazioneMedia():
	restituisce la media delle recensioni ricevute finora (nr stelle) getter e setter (verificare la validità dei dati dei parametri dei setter)*/


public class MobileApp {
	//dichiaro le variabili private della classe
	private String nome;
	private String sistemaOperativo;
	private float  prezzo;
	private ArrayList<Recensione> elencoRecensioni;
	private float ricavoTotale;
	//costruttore + controllo validità
	public MobileApp (String nome,String sistemaOperativo, float  prezzo) throws Exception { 
		if (nome.isBlank()) {
			throw new Exception("nome non valido");
		} else {
			this.nome=nome;
		} if (sistemaOperativo.isBlank()) {
			throw new Exception ("sistema operativo non valido");
		} else {
			this.sistemaOperativo=sistemaOperativo;
		}
		if (prezzo>0) {
			this.prezzo=prezzo;
		} else {
			throw new Exception ("prezzo non valido");
		}
		this.elencoRecensioni=new ArrayList<>();
		
	}
	//Getters and Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome=nome;
	}
	public String getSistemaOperativo() {
		return sistemaOperativo;
	}
	public void setSistemaOperativo(String sistemaOperativo) {
		this.sistemaOperativo=sistemaOperativo;
	}
	public float getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(float prezzo) {
		this.prezzo=prezzo;
	}
	public float getRicavoTotale() {
		return ricavoTotale;
	}
	public void setRicavoTotale(float ricavoTotale) {
		this.ricavoTotale = ricavoTotale;
	}
	public ArrayList<Recensione> getElencoRecensioni() {
			return elencoRecensioni;
			
	}
	//metodi aumento ricavo
	public void download () {
		this.setRicavoTotale(this.getRicavoTotale() + this.prezzo);
	}
	public void download (int numeroDownload) {
		this.setRicavoTotale(this.getRicavoTotale() + this.prezzo * numeroDownload);
	}
	public void riceviRecensione (Recensione recensione) {
		this.elencoRecensioni.add(recensione);
	}
	public float valutazioneMedia() {
		if (elencoRecensioni.isEmpty()) {
			return 0;
		}
		float totStelle=0;
		for ( Recensione recensione : elencoRecensioni) {
			totStelle += recensione.getNumeroStelle();
		}
		return totStelle / elencoRecensioni.size();
	}
	
}
