package Donjon;

import java.util.ArrayList;

import Jeu.Monstre;

public class Salle {

	static ArrayList<Monstre> listeMonstres = new ArrayList<Monstre>();;
	public String nomSalle;
	public static int nbMonstres; 
	

	public Salle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Salle(String nomSalle, int nbMonstres) {
		super();
		this.nomSalle = nomSalle;
		this.nbMonstres = nbMonstres;
	}

	public static ArrayList<Monstre> getlisteMonstres() {
		return listeMonstres;
	}

	public static void setlisteMonstres(ArrayList<Monstre> listeMonstres) {
		Salle.listeMonstres = listeMonstres;
	}

	public static int getNbMonstres() {
		return nbMonstres;
	}

	public void setNbMonstres(int nbMonstres) {
		this.nbMonstres = nbMonstres;
	}

	public  String getNomSalle() {
		return nomSalle;
	}

	public void setNomSalle(String nomSalle) {
		this.nomSalle = nomSalle;
	}
	
//	public  void entreeSalleDonjon(){
//		System.out.println("Voici les salles du ");
//		System.out.println(" ");
//	}
	

	@Override
	public String toString() {
		return "Salle [nbMonstres=" + nbMonstres + ", nomSalle=" + nomSalle + "]";
	}

}
