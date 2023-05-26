package Donjon;

import java.util.ArrayList;

import Jeu.Heros;
import Jeu.Monstre;

public class Donjon {

	public String nomDonjon;
	public int nbSalles;
	public int nbEnnemis;
//	public Heros nomHeros;
	public ArrayList<Salle> salles = new ArrayList<Salle>();
	public ArrayList<Monstre> monstres = new ArrayList<Monstre>();

	public Donjon() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Donjon(String nomDonjon, int nbSalles, int nbEnnemis) {
		super();
		this.nomDonjon = nomDonjon;
		this.nbSalles = nbSalles;
		this.nbEnnemis = nbEnnemis; 
	}

	public String getNomDonjon() {
		return nomDonjon;
	}

	public void setNomDonjon(String nomDonjon) {
		this.nomDonjon = nomDonjon;
	}
	
	


//	public String getEnnemi() {
//		return ennemi;
//	}
//
//	public void setEnnemi(String ennemi) {
//		this.ennemi = ennemi;
//	}

	public ArrayList<Monstre> getEnnemis() {
		return monstres;
	}

	public int getNbSalles() {
		return nbSalles;
	}

	public void setNbSalles(int nbSalles) {
		this.nbSalles = nbSalles;
	}

	public int getNbEnnemis() {
		return nbEnnemis;
	}

	public void setNbEnnemis(int nbEnnemis) {
		this.nbEnnemis = nbEnnemis;
	}

	public void setEnnemis(ArrayList<Monstre> monstres) {
		this.monstres = monstres;
	}

	public ArrayList<Salle> getSalles() {
		return salles;
	}

	public void setSalles(ArrayList<Salle> salles) {
		this.salles = salles;
	}
	
//	public void sallesDuDonjon(){
//		System.out.println(" ");
//	    System.out.println("Les salles sont : "); 
//		 for (Salle nomsalle : salles) {
//			    System.out.println("-- LES SALLES SONT --");
//			    System.out.println("listeSalles");
//			    System.out.println(nomsalle.getNomSalle());
//			  
//		}
//	}
	
	public void sortieDonjon(){
		System.out.println(" ");
		System.out.println("---- Sortie du " + this.getNomDonjon()+ " ----");
	}
	
	@Override
	public String toString() {
		return "Donjon [nomDonjon=" + nomDonjon + ", nbSalles=" + nbSalles + ", nbEnnemis=" + nbEnnemis + ", salles="
				+ salles + ", monstres=" + monstres + "]";
	}

}
