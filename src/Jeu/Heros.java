package Jeu;

import java.util.ArrayList;

import java.util.Scanner;
import Jeu.*;

public class Heros extends Personnage {
	
	public Monstre nomMonstre;

	public Heros() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Heros(String nom, String classe, int PV, int argent, int attaque, int attaqueSpeciale, int defense, int energie, int capacite) {
		super(nom, classe, PV, attaque, argent, attaqueSpeciale, defense, energie, capacite);
		// TODO Auto-generated constructor stub
	}
		
	public final static void nomDuMonstre(){
		System.out.println("nom monstre"); 
		
	}

	

	
	 
	

}
