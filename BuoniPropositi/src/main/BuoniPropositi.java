package main;


import java.util.ArrayList;

import java.util.Scanner;

public class BuoniPropositi {

	 

	public static void main(String[] args) {
		
		int input;
		
		Scanner sc = new Scanner(System.in);	
			
		ArrayList<String>  buoniPropositi = new ArrayList<String>();
		buoniPropositi.add("dimagrire");
		buoniPropositi.add("risparmiare");
		buoniPropositi.add("viaggiare");
		buoniPropositi.add("dormire");
		buoniPropositi.add("leggere");
		
		
		while (buoniPropositi.size()!=0) {
		System.out.println("Lista buoni propositi per il nuovo anno:" + buoniPropositi.toString());
		System.out.println("digita il numero corrispondente al proposito portato a termine (da 0 a 4): ");
		input=sc.nextInt();
		sc.nextLine();
		buoniPropositi.remove(input);
		
		}
		//pro
		
		System.out.println("Complimenti! hai portato a termine tutti i tuoi obbiettivi");
	sc.close();

		
		
		
		
		
	}

}
