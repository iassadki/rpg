package Jeu;

import java.util.ArrayList;

public interface Battle {

	public String attaqueSimple(Heros heros, Monstre monstre);
	public int attaqueForte(Heros h, Monstre m);
	public int capaciteSpeciale(ArrayList<Personnage> listePersonnages);
	
}
