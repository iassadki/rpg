package Jeu;

import java.nio.file.spi.FileSystemProvider;
import java.util.ArrayList;

import java.util.Random;
import java.util.Scanner;

import Donjon.Donjon;
import Donjon.Salle;
import Magasin.Objet;
import Jeu.Zeus;

public class Joueur implements Battle {

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

	// public void attaque(Monstre monstre) {
	// monstre.PV = monstre.PV - this.attaque + monstre.defense;
	// System.out.println("Attaque");
	// }

	public Donjon getDonjonActuel() {
		return donjonActuel;
	}

	public void setDonjonActuel(Donjon donjonActuel) {
		this.donjonActuel = donjonActuel;
	}

	public static void avantCombat(int choixxx) {
		System.out.println("---- QUE VOULEZ VOUS FAIRE ? ----");

	}

	// Heros heros, Heros nomHeros
	public final void attaquer(Monstre monstre) {
//		monstre.PV = monstre.PV - heros.attaque;
		System.out.println("Vous attaquez " + this.nomMonstre);
		System.out.println(
				this.nomMonstre + " attaque " + monstre.nom + " et lui inflige " + (this.attaque) + " dégâts. ");
//				+ "PV de " + monstre.nom + "(" + (monstre.PV) + ") ");
		System.out.println("Il reste " + monstre.PV + " PV à " + monstre.nom);
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

	public static void affichageHeros() {
		System.out.println(listeHeros);
	}

//	public void combat1(Monstre monstre, Salle salle) {
//		Heros heros = null;
////		Heros herosChoisi = null;
//		Scanner sc = new Scanner(System.in);
//
//		while (heros.PV != 0  || monstre.PV != 0) { // si le monstre ou le heros sont à 0 		
////			heros.PV -= 10;
////			System.out.println("heros PV"+heros.PV);
////			heros.PV -= 90;
//			
//			monstre.PV -= 10;
//			monstre.PV -= 90;
//			System.out.println("Monstre : "+monstre.PV);
//			System.out.println("fin");
//			break;
//	}
//	}

	// i == 3 conditions
	// mort - combar fini - fuite

	// Heros heros
	// Armure
//	public void gameover(Heros heros,Monstre monstre) {
//		if(monstre.PV == 0) {
//			System.out.println("Le Monstre est mort");
//		} else if(heros.PV == 0) {
//			System.out.println("Le Heros est mort ");
//		}
//		System.out.println("Vous etes mort");
//	}

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
//		System.out.println("1 :" + listeHeros.get(0));
//		System.out.println("2 :" + listeHeros.get(1));
//		System.out.println("3 :" + listeHeros.get(2));
//		System.out.println("4 :" + listeHeros.get(3));
//		System.out.println("5 :" + listeHeros.get(4));

		System.out.println(" ");
		System.out.println(RED + "==== DEBUT DU COMBAT ====" + RESET);
		System.out.println(" ");

//		for (int i = 0; i < listeHeros.size(); i++){
//			System.out.println("Choisissez votre heros");
//            System.out.println(listeHeros.get(i));
//		}

		for (int i = 0; i < listeHeros.size(); i++) {
			System.out.println((i + 1) + ": " + listeHeros.get(i));
		}

		int choixHeros = sc.nextInt();
		if (choixHeros >= 1 && choixHeros <= listeHeros.size()) {
			System.out.println("Vous avez choisi : " + listeHeros.get(choixHeros - 1));
			heros = listeHeros.get(choixHeros - 1);
		} else {
			System.out.println("Choix invalide");
		}

//			monstre.PV -= 10;
//			monstre.PV -= 90;	    
		// do {
		
		Random random = new Random();
//		int chiffreAleatoireTour = random.nextInt(2);
		boolean tourHeros = Math.random() < 0.5;

		while (monstre.PV > 0 && heros.PV > 0) {        

        if (tourHeros) {
				System.out.println(" ");
				System.out.println("---- VOTRE TOUR ---- " +heros.nom + " " + heros.PV + " PV VS " + monstre.nom + " " + monstre.PV + " PV");
//				System.out.println("---- Que voulez vous faire ?");
				System.out.println("-- "+tourHeros);
//				System.out.println("Chiffre aleatoire - 0 ou 1 : " + chiffreAleatoireTour);
//				System.out.println("Tour Monstre : " +tourMonstre);
//				System.out.println("Tour Heros : " +tourHeros);
				System.out.println("-- 1 : Attaquer"); // Infliger tel PV sur le monstre
				System.out.println("-- 2 : Attaque speciale"); // Encaisser moins de PV
				System.out.println("-- 3 : Se defendre");
				System.out.println("-- 4 : S'equiper"); // Prendre plus de PV
				
//				tourHeros = !tourHeros; // False Heros
				
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
//					System.out.println(tourHeros);
					break;
				case 4: // S'equiper
					System.out.println("-- S'equiper");
					System.out.println("-- MAGASIN -- " +heros.nom+ " " +heros.PV+ " PV   "+heros.argent+" $");
					System.out.println("-- 1 : Aller au Magasin");
					System.out.println("-- 1 : Quitter le Magasin");
					int choixMagasin = sc.nextInt();
					switch (choixMagasin) {
						case 1:
							for (int i = 0; i < listeObjets.size(); i++) {
								System.out.println((i + 1) + ": " + listeObjets.get(i));
							}
//							Objet objet = null;
							int choixInventaire = sc.nextInt();
							if (heros.argent > 0 && heros.PV <= 100) { // IF #1 -- si heros a plus de 0$ et que heros a moins ou egal a 100PV
								if (choixInventaire >= 1 && choixInventaire <= listeObjets.size()) { // IF #2
									System.out.println("Vous etes a "+heros.PV+" PV");
									System.out.println("Vous avez choisi : " + listeObjets.get(choixInventaire - 1));
									objet = listeObjets.get(choixInventaire - 1);
									heros.PV = heros.PV + objet.pvAjoutes;
									heros.argent = heros.argent - objet.prixObjet;
									System.out.println("Vous avez recuperé "+objet.pvAjoutes+" PV. Vous avez "+heros.PV+" PV");
								} else { // IF #2
									System.out.println("Choix invalide");
								} 
							} else { // IF #1
								System.out.println("Vous n'avez pas d'argent");
							}
								break;
								
						case 2:
							System.out.println("-- Sortie du magasin...");
							break;
					}
					
					

				default:
					System.out.println("-- Sortie du magasin...");
					break;
				}
//				break;
        } else { // case true:
				System.out.println(" ");
				System.out.println("---- TOUR DU MONSTRE ---- " +heros.nom + " " + heros.PV + " PV VS " + monstre.nom + " " + monstre.PV + " PV");
				System.out.println("-- "+tourHeros);
//				System.out.println("Chiffre aleatoire - 0 ou 1 : " + chiffreAleatoireTour);
//				System.out.println("Tour Monstre : " +tourMonstre);
//				System.out.println("Tour Heros : " +tourHeros);
//				
//				tourMonstre = !tourMonstre; // False Monstre
//				System.out.println("Tour Heros actualise pendant le combat : "+tourHeros);
				
				switch (monstre.classe) {
				case "Titan":
//					System.out.println("Titan");
					if (monstre.PV >= heros.PV) { 
						System.out.println("-- Le monstre attaque");
						System.out.println("-- "+monstre.nom+ " vous à attaque, et vous avez perdu "+monstre.attaque+ " PV");
						heros.PV = heros.PV - monstre.attaque;
//						herosEstAttaque = true;
						//break;
					} else if (monstre.PV < heros.PV) {
						System.out.println("-- Le monstre se defend");
						System.out.println(monstre.nom+ " s'est defendu");
						monstre.PV = monstre.PV + 10;
//						herosEstAttaque = true;
						//break;
					} else if (heros.PV <=  20) {
						System.out.println("-- Le monstre attaque");
						System.out.println("-- "+monstre.nom+ " vous à attaque, et vous avez perdu "+monstre.attaque+ " PV");
						heros.PV = heros.PV - monstre.attaque;
//						herosEstAttaque = true;
						//break;
					} else {
						System.out.println(" ");
						System.out.println("-- Le monstre fait une attaque speciale");
						System.out.println("-- "+monstre.nom+ " vous à attaque, et vous avez perdu "+monstre.attaqueSpeciale+ " PV");
						heros.PV = heros.PV - monstre.attaqueSpeciale;
//						herosEstAttaque = true;
						//break;
					}
					break;
				case "Cyclope":
//					System.out.println("Cyclope");
					if (monstre.PV > 0.5 * 100) {
	                    int degatsMonstre = random.nextInt(30) + 20;
	                    System.out.println("-- Le monstre à lance une attaque puissante et inflige " + degatsMonstre + " dégâts. PV du héros : " + heros.PV);
	                    heros.PV = heros.PV - degatsMonstre;
					} else if (monstre.PV <= 20) { // Si la santé du joueur est inférieure ou égale à 20 PV, le monstre choisit une attaque qui inflige des dégâts élevés au joueur. 
						System.out.println("-- Le monstre attaque");
						System.out.println("-- "+monstre.nom+ " vous à attaque, et vous avez perdu "+monstre.attaque+ " PV");
						int degatsAdditionnes = 0;
						degatsAdditionnes = monstre.attaqueSpeciale + 15;
						heros.PV = heros.PV - degatsAdditionnes;
					} else if (monstre.PV < heros.PV) {
						System.out.println("-- Le monstre se defend");
						System.out.println("-- "+monstre.nom+ " s'est defendu");
						monstre.PV = monstre.PV + 10;
//						herosEstAttaque = true;
						//break;
					} else {
						System.out.println(" ");
						System.out.println("-- Le monstre fait une attaque speciale");
						System.out.println("-- "+monstre.nom+ " vous à attaque, et vous avez perdu "+monstre.attaqueSpeciale+ " PV");
						heros.PV = heros.PV - monstre.attaqueSpeciale;
//						herosEstAttaque = true;
						//break;
					}
					break;
				case "Zeus": // herosEstAttaque = false &&
					// faire en sorte de rentrer dans la condition que une fois
//					System.out.println("Zeus");
					if (monstre.PV >= heros.PV) { 
						System.out.println("-- Le monstre attaque");
						System.out.println("-- "+monstre.nom+ " vous à attaque, et vous avez perdu "+monstre.attaque+ " PV");
						heros.PV = heros.PV - monstre.attaque;
//						herosEstAttaque = true;
						//break;
					} else if (monstre.PV < heros.PV) {
						System.out.println("-- Le monstre se defend");
						System.out.println("-- "+monstre.nom+ " s'est defendu");
						monstre.PV = monstre.PV + 10;
//						herosEstAttaque = true;
						//break;
					} else if (heros.PV <=  20) {
						System.out.println("-- Le monstre attaque");
						System.out.println("-- "+monstre.nom+ " vous à attaque, et vous avez perdu "+monstre.attaque+ " PV");
						heros.PV = heros.PV - monstre.attaque;
//						herosEstAttaque = true;
						//break;
					} else {
						System.out.println(" ");
						System.out.println("-- Le monstre fait une attaque speciale");
						System.out.println("-- "+monstre.nom+ " vous à attaque, et vous avez perdu "+monstre.attaqueSpeciale+ " PV");
						heros.PV = heros.PV - monstre.attaqueSpeciale;
//						herosEstAttaque = true;
						//break;
					}
					break;
			    case "Boss":
			        System.out.println("Boss");
			        break;
			    default:
			        System.out.println("Aucun choix, tour suivant");
			        break;
			}


        }

//					switch (herosEstAttaque) {
//					case "false":
//						System.out.println("Nested Case 1");
//						// faire en sorte de rentrer dans la condition que une fois
//						if (monstre.PV >= heros.PV) {
//							System.out.println("-- Le monstre attaque");
//							System.out.println(monstre.nom + " vous à attaque, et vous avez perdu " + monstre.attaque + " PV");
//							heros.PV = heros.PV - monstre.attaque;
////								herosEstAttaque = true;
//							// break;
//						} else if (monstre.PV < heros.PV) {
//							System.out.println("-- Le monstre se defend");
//							System.out.println(monstre.nom + " s'est defendu");
//							monstre.PV = monstre.PV + 10;
////								herosEstAttaque = true;
//							// break;
//						} else if (heros.PV <= 20) {
//							System.out.println("-- Le monstre attaque");
//							System.out.println(monstre.nom + " vous à attaque, et vous avez perdu " + monstre.attaque + " PV");
//							heros.PV = heros.PV - monstre.attaque;
////								herosEstAttaque = true;
//							// break;
//						}
//						break;
//					case "true":
//						System.out.println("Nested Case 2");
//						break;
//					default:
//						System.out.println("Tour suivant");
//						break;
//					}
//					herosEstAttaque = "true";
//					break;
//				}
//			}

				    	

//			
			if (monstre.PV <= 0) {
				System.out.println(" ");
				System.out.println("Vous avez " + heros.PV + " PV");
				System.out.println(RED + "==== FIN DU COMBAT ====" + RESET);
				System.out.println("Suppression du monstre " + monstre + " de la liste");
				listeHeros.remove(monstre);
//				
//				if (chiffreAleatoireTour == 0) {
//					tourMonstre = !tourMonstre; // False Monstre
//				} else if (chiffreAleatoireTour == 1) {
//			        tourHeros = !tourHeros; // False Heros
//				}
//				System.out.println("Tour Heros actualise : "+tourHeros);
//				System.out.println("Tour Monstre actualise : "+tourMonstre);
				
//				herosEstAttaque = false;
			} else if (heros.PV <= 0) {
				System.out.println(" ");
				System.out.println("Votre heros est mort, choisissez un autre pour continuer le combat contre " + monstre.nom);
				System.out.println(RED + "==== FIN DU COMBAT ====" + RESET);
				System.out.println("Suppression du monstre " + heros.nom + " de la liste");
				listeHeros.remove(heros);
				
//				System.out.println("Tour Heros actualise : "+tourHeros);


				// Choix d'un autre Heros, si le Heros choisi au debut est mort
				for (int i = 0; i < listeHeros.size(); i++) {
					System.out.println((i + 1) + ": " + listeHeros.get(i));
				}

				int choixHerosAgain = sc.nextInt();
				if (choixHerosAgain >= 1 && choixHerosAgain <= listeHeros.size()) {
					System.out.println("Vous avez choisi pour reprendre le combat : " + listeHeros.get(choixHerosAgain - 1));
					heros = listeHeros.get(choixHerosAgain - 1);
				} else {
					System.out.println("Choix invalide, ou vous n'avez plus de Heros");
					System.out.println("Game Over");
				}
//				break;
			}
	        tourHeros = !tourHeros; // False Heros
	        System.out.println(" ");
	        System.out.println("-- " +tourHeros);
		}

//					// +5PV a Heros, donc Monstre attaque avec le meme nombre de PV infligés

//					// recuperer le nombre de PV infligés du Monstre
//					// afficher le nombre de PV restants du joueur

//					// afficher les objets qu'il reste, avec leur "montant" restant
//					// condition si il reste encore des objets ou pas

	}
	////

	public final static void finCombat() {
		System.out.println(" ");
//		Thread.sleep(1000);
		System.out.println(RED + "---- FIN DU COMBAT ----" + RESET);
		System.out.println(" ");
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

	// Méthode pour gérer le tour du heros
	public void tourHeros(Monstre monstre) {
	}

//	// Méthode pour gérer le tour du monstre
//	public void tourDeCombat(Heros heros) {
//		Random random = new Random();
//		// Si le monstre a moins de 20 points de vie, il attaque
//		if (heros.getPV() < 20) {
//			System.out.println("Le monstre attaque !");
//			int attaque_heros = random.nextInt(heros.attaque) + 1;
//			heros.setPV(heros.getPV() - attaque_heros);
//			System.out.println("Le héros perd " + attaque_heros + " points de vie !");
//		} else {
//			System.out.println("Le monstre se prépare à attaquer !");
//		}
//	}

	public final void retourAuMilieu() {
		Heros heros = null;
		Objet objet = null;
		Scanner sc = new Scanner(System.in);

		// Un joueur a une liste de heros qu'il choisit
		// Heros a une liste d'objets qu'il choisit
		
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
			System.out.println("-- Liste des en-cas à acheter");
			
			for (int i = 0; i < listeObjets.size(); i++) {
				System.out.println((i + 1) + ": " + listeObjets.get(i));
			}

			int choixObjet = sc.nextInt();
			if (choixObjet >= 1 && choixObjet <= listeObjets.size()) {
				System.out.println("Vous avez choisi : " + listeObjets.get(choixObjet - 1));
				objet = listeObjets.get(choixObjet - 1);
			} else {
				System.out.println("Choix invalide");
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

//		Scanner sc = new Scanner(System.in);


		
//		int choixMilieu = sc.nextInt();
//			int choix_djn = sc.nextInt();
//			System.out.println("Le Donjon est : " + this.getDonjonActuel());
//			if (choix_djn == 1) {
//				System.out.println("Transfert vers le Donjon ...");
//			} else if (choix_djn == 2) {
//				System.out.println("Transfert vers l'autre Donjon ...");
//			} else {
//				System.out.println("Choix incorrect");
//			}

//		if (choixMilieu == 1) {
//			System.out.println("--> Transfert vers le prochain Donjon");
//		} else if (choixMilieu == 2) {
//			System.out.println("--> Liste des en-cas");
//			// Lister tout les en-cas avec leur prix
//			// Si pas assez d'argent, pas possible d'acheter
//
//		} else if (choixMilieu == 3) {
//			System.out.println("--> Sortie du jeu...");
//			System.exit(0);
//		} else {
//			System.out.println("Choix incorrect");
//		}
	}

	@Override
	public String attaqueSimple(Heros heros, Monstre monstre) {
		System.out.println("Vous venez de faire une attaqueSimple");
		int pvDuMonstre = monstre.PV -= 30;
		System.out.println("PV du monstre : " + pvDuMonstre);

		System.out.println("Vous avez fait perdre 100PV au Monstre");
		String retour = " ";
		return retour;
	}

	@Override
	public int attaqueForte(Heros h, Monstre m) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int capaciteSpeciale(ArrayList<Personnage> listePersonnages) {
		// TODO Auto-generated method stub
		return 0;
	}

}
