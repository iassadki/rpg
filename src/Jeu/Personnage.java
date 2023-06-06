package Jeu;

import java.util.ArrayList;

public class Personnage {

	static ArrayList<Personnage> listePersos = new ArrayList<Personnage>();
	public String nom;
	public String classe;
	public int PV;
	public int argent;
	public int attaque;
	public int attaqueSpeciale;
	public int defense;
	public int energie;
	public int capacite;

	public Personnage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Personnage(String nom, String classe, int PV, int attaque, int argent, int attaqueSpeciale, int defense,
			int energie, int capacite) {
		super();
		this.nom = nom;
		this.classe = classe;
		this.PV = PV;
		this.argent = argent;
		this.attaque = attaque;
		this.attaqueSpeciale = attaqueSpeciale;
		this.defense = defense;
		this.energie = energie;
		this.capacite = capacite;
	}

	public int getAttaqueSpeciale() {
		return attaqueSpeciale;
	}

	public void setAttaqueSpeciale(int attaqueSpeciale) {
		this.attaqueSpeciale = attaqueSpeciale;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public int getPV() {
		return PV;
	}

	public void setPV(int pV) {
		PV = pV;
	}

	public int getAttaque() {
		return attaque;
	}

	public void setAttaque(int attaque) {
		this.attaque = attaque;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	public int getEnergie() {
		return energie;
	}

	public void setEnergie(int energie) {
		this.energie = energie;
	}

	public int getCapacite() {
		return capacite;
	}

	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}

//	public void attaque() {
//		System.out.println("Attaque");
//	}

	public int getArgent() {
		return argent;
	}

	public void setArgent(int argent) {
		this.argent = argent;
	}

	public void menu() {
		System.out.println("---- QUE VOULEZ VOUS FAIRE ----");
	}

	@Override
	public String toString() {
		return "Personnage [nom=" + nom + ", classe=" + classe + ", PV=" + PV + ", attaque=" + attaque + ", defense="
				+ defense + ", energie=" + energie + ", capacite=" + capacite + "]";
	}

}
