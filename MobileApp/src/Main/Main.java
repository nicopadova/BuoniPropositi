package Main;

import java.time.LocalDate;
import java.util.Scanner;

import Model.MobileApp;
import Model.Recensione;

public class Main {
	//dichiaro lo scanner e le variabili
	public static void main(String[] args) throws Exception{
	Scanner sc = new Scanner(System.in);
	String nome, sistemaOperativo, nomeUtente, testo;
	float prezzo;
	int scelta, nrDownload, numeroStelle;
	//input dati MobileApp
	System.out.println("Inserisci il nome del App:");
	nome = sc.nextLine();
	System.out.println("inserisci il sistema operativo:");
	sistemaOperativo = sc.nextLine();
	System.out.println("inserisci il prezzo del App:");
	prezzo = sc.nextFloat();
	sc.nextLine();
	//creo un nuovo oggetto della classe MobileApp
	MobileApp app = new MobileApp(nome, sistemaOperativo, prezzo);
	//inizio ciclo menu
	do {
		//stampo menu scelta
		System.out.println("Menu:");
		System.out.println("1-download singolo \n2-download multiplo \n3-ricevi recensione \n4-visualizza recensioni \n5-esci");
		System.out.println("scegli una delle voci:");
		scelta = sc.nextInt();
		sc.nextLine();
		
		//faccio lo switch per i 5 casi
		switch(scelta) {
		
		case 1:
			app.download();
			System.out.println("download singolo completato!");
			
			break;
			
		case 2:
			System.out.println("inserisci il numero di download che vuoi eseguire");
			nrDownload = sc.nextInt();
			sc.nextLine();
			app.download(nrDownload);
			System.out.println("download multiplo completato!");
			
			break;
			
		case 3:
			System.out.println("inserisci il tuo nome utente:");
			nomeUtente = sc.nextLine();
			System.out.println("quante stelle vuoi assegnare? (min 1 max 5):");
			numeroStelle = sc.nextInt();
			sc.nextLine();
			System.out.println("inserisci il testo della recensione:");
			testo = sc.nextLine();
			Recensione recensione = new Recensione (LocalDate.now(), nomeUtente, numeroStelle, testo);
			app.riceviRecensione(recensione);
			System.out.println("recensione inviata!");
			
			break;
		
		case 4:
			for (Recensione r : app.getElencoRecensioni()) {
				System.out.println("data: " + r.getData() + "| nome utente: " + r.getNomeUtente() + "| numero stelle: "+ r.getNumeroStelle() + "| testo:" + r.getTesto());
			}
			
			break;
		case 5:
			break;
			
		default:
			System.out.println("scelta non valida");
		}
		//visualizzazione dati della mobile app
		System.out.println("dati dell'app:");
		System.out.println("Ricavo totale: " + app.getRicavoTotale() + "\nValutazione media: " +  String.format("%.2f", app.valutazioneMedia()));
	}while (scelta!=5);
	sc.close();
	}

}
