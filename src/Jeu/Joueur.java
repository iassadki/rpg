package Jeu;

import java.nio.file.spi.FileSystemProvider;
import java.util.ArrayList;

import java.util.Random;
import java.util.Scanner;

import Donjon.Donjon;
import Donjon.Salle;
import Magasin.Objet;
import Jeu.Zeus;

public class Joueur {

	public static final String RED = "\u001B[31m";
	public static final String RESET = "\u001B[0m";

	public String nomJoueur;
	public Donjon donjonActuel;
	public Heros attaque;
	public Monstre nomMonstre;
	public int argent;

	public static ArrayList<Objet> listeObjets = new ArrayList<Objet>();
	public static ArrayList<Heros> listeHeros = new ArrayList<Heros>();

	public Joueur(String nomJoueur) {
		super();
		this.nomJoueur = nomJoueur;
	}

	public Joueur() {
		super();
		// TODO Auto-generated constructor stub

	}

	public String getNom() {
		return nomJoueur;
	}

	public int getArgent() {
		return argent;
	}

	public void setArgent(int argent) {
		this.argent = argent;
	}

	public Heros getAttaque() {
		return attaque;
	}

	public void setAttaque(Heros attaque) {
		this.attaque = attaque;
	}

	public void setNom(String nomJoueur) {
		this.nomJoueur = nomJoueur;
	}

	public static ArrayList<Heros> getListeHeros() {
		return listeHeros;
	}

	public static void setListeHeros(ArrayList<Heros> listeHeros) {
		Joueur.listeHeros = listeHeros;
	}

	@Override
	public String toString() {
		return "Joueur [nomJoueur=" + nomJoueur + "]";
	}

	public Donjon getDonjonActuel() {
		return donjonActuel;
	}

	public void setDonjonActuel(Donjon donjonActuel) {
		this.donjonActuel = donjonActuel;
	}

	public static void avantCombat(int choixxx) {
		System.out.println("---- QUE VOULEZ VOUS FAIRE ? ----");

	}

	public static void lesSalles(Salle salles) {
		System.out.println("--- Liste des salles restantes");
		System.out.println("Il reste ... salles");
	}

	public static void entreeDonjon(Donjon donjon) {
//		Thread.sleep(3000); 
		System.out.println(" ");
		System.out.println("--> Entree dans " + donjon.nomDonjon);
	}

	public static void entreeSalle(Donjon donjon, Salle salle) {
//		Thread.sleep(3000); 
		System.out.println("--> Entree dans " + salle.nomSalle);
		System.out.println("--> Cette salle contient " + donjon.nbSalles + " Monstres");
	}

	public void choixHeros(Heros heros) {
		Scanner sc = new Scanner(System.in);

		int choixHeros = sc.nextInt();
		if (choixHeros == 1) {
			heros = listeHeros.get(0);
			System.out.println("Le Heros choisi est " + heros);
//			System.out.println("Heros PV :"+heros.PV);
		} else if (choixHeros == 2) {
			heros = listeHeros.get(1);
			System.out.println("Le Heros choisi est " + heros);
		} else if (choixHeros == 3) {
			heros = listeHeros.get(2);
			System.out.println("Le Heros choisi est " + heros);
		} else if (choixHeros == 4) {
			heros = listeHeros.get(3);
			System.out.println("Le Heros choisi est " + heros);
		} else if (choixHeros == 5) {
			heros = listeHeros.get(4);
			System.out.println("Le Heros choisi est " + heros);
		} else {
			System.out.println("Choix incorrect");
		}
	}

	public void combat(Monstre monstre, Salle salle) {
		Heros heros = null;
		Objet objet = null;
		Scanner sc = new Scanner(System.in);

//		while (heros.PV != 0  || monstre.PV != 0) { // si le monstre ou le heros sont à 0
		System.out.println(" ");
		System.out.println("--> Combat contre " + monstre.nom + " dans " + salle.nomSalle);
		System.out.println("Choix du heros pour combattre");

		System.out.println(" ");
		System.out.println(RED + "==== DEBUT DU COMBAT ====" + RESET);
		System.out.println(" ");


		for (int i = 0; i < listeHeros.size(); i++) {
			System.out.println((i + 1) + ": " + listeHeros.get(i));
		}

		if (listeHeros.isEmpty()) {
			System.out.println(" ");
			System.out.println("Vous n'avez plus de Heros dans votre liste de Heros");
			System.out.println(RED + "==== FIN DU COMBAT ====" + RESET);
			System.out.println("==== FIN DU JEU ====");
			System.exit(0);
		}

		int choixHeros = sc.nextInt();
		if (choixHeros >= 1 && choixHeros <= listeHeros.size()) {
			System.out.println("Vous avez choisi : " + listeHeros.get(choixHeros - 1));
			heros = listeHeros.get(choixHeros - 1);
		} else {
			System.out.println("Choix incorrect");
		}

		Random random = new Random();
		boolean tourHeros = Math.random() < 0.5;

		while (monstre.PV > 0 && heros.PV > 0) {

			if (tourHeros) {
				System.out.println(" ");
				System.out.println("---- VOTRE TOUR ---- " + heros.nom + " " + heros.PV + " PV VS " + monstre.nom + " "
						+ monstre.PV + " PV");
				System.out.println("-- 1 : Attaquer");
				System.out.println("-- 2 : Attaque speciale");
				System.out.println("-- 3 : Se defendre");
				System.out.println("-- 4 : S'equiper");

				int choixCombat = sc.nextInt();
				switch (choixCombat) {
				case 1: // Attaque
					System.out.println("-- 1 : Attaque de base");
					System.out.println("-- Vous avez inflige " + heros.attaque + " de degats a " + monstre.nom);
					monstre.PV = monstre.PV - heros.attaque;
					break;
				case 2: // Attaque Speciale
					System.out.println("-- Vous avez inflige " + heros.attaqueSpeciale + " de degats a " + monstre.nom);
					monstre.PV = monstre.PV - heros.attaqueSpeciale;
					break;
				case 3: // Defense
					System.out.println("-- Defense");
					heros.PV = heros.PV + 6;
					break;
				case 4: // S'equiper
					System.out.println("-- S'equiper");
					System.out.println("-- MAGASIN -- " + heros.nom + " " + heros.PV + " PV   " + heros.argent + " $");
					System.out.println("-- 1 : Aller au Magasin");
					System.out.println("-- 2 : Quitter le Magasin");
					int choixMagasin = sc.nextInt();
					switch (choixMagasin) {
					case 1:
						for (int i = 0; i < listeObjets.size(); i++) {
							System.out.println((i + 1) + ": " + listeObjets.get(i));
						}
//							Objet objet = null;
						int choixInventaire = sc.nextInt();
						if (heros.argent > 0 && heros.PV <= 100) { // IF #1
							if (choixInventaire >= 1 && choixInventaire <= listeObjets.size()) { // IF #2
								System.out.println("Vous etes a " + heros.PV + " PV");
								System.out.println("Vous avez choisi : " + listeObjets.get(choixInventaire - 1));
								objet = listeObjets.get(choixInventaire - 1);
								heros.PV = heros.PV + objet.pvAjoutes;
								heros.argent = heros.argent - objet.prixObjet;
								if (heros.PV > 100) {
									System.out.println("Vous avez depasse la limite de 100 PV");
									int herospvModif = 0;
									int argentModif = 0;
									argentModif = heros.argent - objet.prixObjet;
									argentModif = heros.argent;
									herospvModif = heros.PV - objet.pvAjoutes;
									heros.PV = herospvModif; //
								} else {
									System.out.println("Vous avez recuperé " + objet.pvAjoutes + " PV. Vous avez "
											+ heros.PV + " PV");
								}

							} else { // IF #1
								System.out.println("Vous n'avez pas d'argent");
							}
						}

					case 2:
						System.out.println("-- Sortie du magasin...");
						break;

					default:
						System.out.println("-- Aucune action choisie...");
						break;
					}
				}
//				break;
			} else { // case true:
				System.out.println(" ");
				System.out.println("---- TOUR DU MONSTRE ---- " + heros.nom + " " + heros.PV + " PV VS " + monstre.nom
						+ " " + monstre.PV + " PV");

				switch (monstre.classe) {
				case "Titan":
					if (heros.defense < monstre.attaque) { // monstre.PV >= heros.PV
						heros.PV = heros.PV - monstre.attaque;
					} else if (heros.attaque < monstre.defense) {
						heros.PV = heros.PV - monstre.attaque;
					} else {
						System.out.println(" ");
						System.out.println("-- Le monstre fait une attaque speciale");
						System.out.println("-- " + monstre.nom + " vous à attaque, et vous avez perdu "
								+ monstre.attaqueSpeciale + " PV");
						heros.PV = heros.PV - monstre.attaqueSpeciale;
					}

				case "Cyclope":
					if (monstre.PV > 0.5 * 100) {
						int degatsMonstre = 19;
						System.out.println("-- Le monstre à lance une attaque puissante et inflige " + degatsMonstre
								+ " dégâts. PV du héros : ");
						heros.PV = heros.PV - degatsMonstre;
						System.out.println("PV du heros" + heros.PV);
					} else if (monstre.PV <= 20) { // Si la santé du joueur est inférieure ou égale à 20 PV, le monstre
													// choisit une attaque qui inflige des dégâts élevés au joueur.
						System.out.println("-- Le monstre attaque");
						System.out.println(
								"-- " + monstre.nom + " vous à attaque, et vous avez perdu " + monstre.attaque + " PV");
						int degatsAdditionnes = 0;
						degatsAdditionnes = monstre.attaqueSpeciale + 5;
						heros.PV = heros.PV - degatsAdditionnes;
					} else if (monstre.PV < heros.PV) {
						System.out.println("-- Le monstre se defend");
						System.out.println("-- " + monstre.nom + " s'est defendu");
						monstre.PV = monstre.PV + 10;
					} else {
						System.out.println(" ");
						System.out.println("-- Le monstre fait une attaque speciale");
						System.out.println("-- " + monstre.nom + " vous à attaque, et vous avez perdu "
								+ monstre.attaqueSpeciale + " PV");
						heros.PV = heros.PV - monstre.attaqueSpeciale;
					}
					break;
				case "Zeus": // herosEstAttaque = false &&
					if (monstre.PV >= heros.PV) {
						System.out.println("-- Le monstre attaque");
						System.out.println(
								"-- " + monstre.nom + " vous à attaque, et vous avez perdu " + monstre.attaque + " PV");
						heros.PV = heros.PV - monstre.attaque;
					} else if (monstre.PV < heros.PV) {
						System.out.println("-- Le monstre se defend");
						System.out.println("-- " + monstre.nom + " s'est defendu");
						monstre.PV = monstre.PV + 10;
					} else if (heros.PV <= 20) {
						System.out.println("-- Le monstre attaque");
						System.out.println(
								"-- " + monstre.nom + " vous à attaque, et vous avez perdu " + monstre.attaque + " PV");
						heros.PV = heros.PV - monstre.attaque;
					} else {
						System.out.println(" ");
						System.out.println("-- Le monstre fait une attaque speciale");
						System.out.println("-- " + monstre.nom + " vous à attaque, et vous avez perdu "
								+ monstre.attaqueSpeciale + " PV");
						heros.PV = heros.PV - monstre.attaqueSpeciale;
					}
					break;
				case "Boss":
					System.out.println("Boss");
					if (heros.defense < 0.8 * monstre.attaque) {
						heros.PV = heros.PV - monstre.attaque;
					} else if (heros.attaque < 0.9 * monstre.defense) {
						heros.PV = heros.PV - monstre.attaque;
					} else if (heros.PV <= 30) {
						heros.PV = heros.PV - monstre.attaque;
					}
					break;
				default:
					System.out.println("Aucun choix, tour suivant");
					break;
				}

			}

			if (monstre.PV <= 0) {
				System.out.println(" ");
				System.out.println("Vous avez " + heros.PV + " PV");
				System.out.println(monstre.nom + " est mort");
				System.out.println("Suppression du monstre " + monstre + " de la liste");
				System.out.println(RED + "==== FIN DU COMBAT ====" + RESET);
				listeHeros.remove(monstre);

			} else if (heros.PV <= 0) {
				System.out.println(" ");
				System.out.println(
						"Votre heros est mort, choisissez un autre pour continuer le combat contre " + monstre.nom);
				System.out.println("Suppression du heros " + heros.nom + " de la liste");
				System.out.println(RED + "==== FIN DU COMBAT ====" + RESET);
				listeHeros.remove(heros);
				if (listeHeros.isEmpty()) {
					System.out.println(" ");
					System.out.println("Vous n'avez plus de Heros dans votre liste de Heros");
					System.out.println("==== FIN DU JEU, VOUS AVEZ PERDU====");
					listeHeros.remove(heros);
					System.exit(0);
				} else {

					// Choix d'un autre Heros, si le Heros choisi au debut est mort
					for (int i = 0; i < listeHeros.size(); i++) {
						System.out.println((i + 1) + ": " + listeHeros.get(i));
					}

					int choixHerosAgain = sc.nextInt();
					if (choixHerosAgain >= 1 && choixHerosAgain <= listeHeros.size()) {
						System.out.println(
								"Vous avez choisi pour reprendre le combat : " + listeHeros.get(choixHerosAgain - 1));
						heros = listeHeros.get(choixHerosAgain - 1);
					}
				}

			} else if (monstre.classe == "Boss" && monstre.PV <= 0) {
				System.out.println(" ");
				System.out.println("Vous venez de tuer le Boss");
				listeHeros.remove(monstre);
				System.out.println("==== FIN DU JEU, VOUS AVEZ GAGNE====");
				System.exit(0);
			}

			tourHeros = !tourHeros; // False Heros
			System.out.println(" ");
		} // Fin While
	}

	public void affichageMenuDonjon() {
		System.out.println(" ");
		Scanner sc = new Scanner(System.in);
		System.out.println("---- Que voulez vous faire ?");
		System.out.println("-- 1 : Retour au milieu");
		System.out.println("-- 2 : Quitter le jeu");
//        Donjon.sortieDonjon();
		int choixMenu = sc.nextInt();
		if (choixMenu == 1) {
//			System.out.println("--> Retour au milieu...");
		} else if (choixMenu == 2) {
			System.out.println("Sortie du jeu...");
			System.exit(0);
		} else {
			System.out.println("Choix incorrect");
		}
	}

	public final void retourAuMilieu() {
		Heros heros = null;
		Objet objet = null;
		Scanner sc = new Scanner(System.in);

		// Un joueur a une liste de heros qu'il choisit
		// Heros a une liste d'objets qu'il choisit
		System.out.println(" ");
		System.out.println("--> Retour au milieu");
		System.out.println("---- Que voulez vous faire ?");
		System.out.println("-- 1 : Aller au prochain Donjon");
		System.out.println("-- 2 : Acheter des en-cas");
		System.out.println("-- 3 : Quitter le jeu");

		int choixMenu = sc.nextInt();
		switch (choixMenu) {
		case 1: // Prochain Donjon
			System.out.println(" ");

			break;
		case 2: // En cas
			System.out.println("-- Achat d'en-cas");
			System.out.println("-- Quel heros voulez vous guerir ?");

			for (int i = 0; i < listeHeros.size(); i++) {
				System.out.println((i + 1) + ": " + listeHeros.get(i));
			}

			int choixHeros0 = sc.nextInt();
			if (choixHeros0 >= 1 && choixHeros0 <= listeHeros.size()) {
				System.out.println("Vous avez choisi : " + listeHeros.get(choixHeros0 - 1));
				heros = listeHeros.get(choixHeros0 - 1);
			} else if (listeHeros.isEmpty()) {
				System.out.println(" ");
				System.out.println("Vous n'avez plus de Heros dans votre liste de Heros");
				System.out.println("==== FIN DU JEU, VOUS AVEZ PERDU====");
				System.exit(0);
			}
			System.out.println("-- Liste des en-cas à acheter");

			for (int i = 0; i < listeObjets.size(); i++) {
				System.out.println((i + 1) + ": " + listeObjets.get(i));
			}
			int choixInv = sc.nextInt();
			if (heros.argent > 0 && heros.PV <= 100) { // IF #1
				if (choixInv >= 1 && choixInv <= listeObjets.size()) { // IF #2
					System.out.println("Vous etes a " + heros.PV + " PV");
					System.out.println("Vous avez choisi : " + listeObjets.get(choixInv - 1));
					objet = listeObjets.get(choixInv - 1);
					heros.PV = heros.PV + objet.pvAjoutes;
					heros.argent = heros.argent - objet.prixObjet;
					if (heros.PV > 100) {
						System.out.println("Vous avez depasse la limite de 100 PV");
						int herospvModif0 = 0;
						int argentModif0 = 0;
						argentModif0 = heros.argent - objet.prixObjet;
						argentModif0 = heros.argent;
						herospvModif0 = heros.PV - objet.pvAjoutes;
						heros.PV = herospvModif0; //
					} else {
						System.out.println(
								"Vous avez recuperé " + objet.pvAjoutes + " PV. Vous avez " + heros.PV + " PV");
					}

				} else { // IF #1
					System.out.println("Vous n'avez pas d'argent");
				}
			}
			break;

		case 3: // Quitter le jeu
			System.out.println(" ");
			System.out.println("Sortie du jeu...");
			System.exit(0);
			break;
		default:
			System.out.println("Choix incorrect");
			break;
		}

	}

}
