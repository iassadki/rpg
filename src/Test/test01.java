package Test;

import java.io.InvalidClassException;

import java.util.ArrayList;
import java.util.Scanner;

import Donjon.Donjon;
import Donjon.Salle;
import Jeu.Zeus;
import Magasin.Fruit;
import Magasin.Objet;
import Magasin.Potion;
import Jeu.Boss;
import Jeu.Cyclope;
import Jeu.Guerrier;
import Jeu.Joueur;
import Jeu.Mage;
import Jeu.Personnage;
import Jeu.Voleur;
import Jeu.Heros;
import Jeu.Monstre;

public class test01 {

	public static void main(String[] args) throws InterruptedException {

		Scanner sc = new Scanner(System.in);

		Joueur j1 = new Joueur();

		// Objets
		Objet fruitDuDemon = new Fruit();
		Objet pommeAbandonee = new Fruit();
		Objet petitePotion = new Potion();
		Objet grossePotion = new Potion();

		Personnage p1 = new Personnage();

		// Heros
		Heros mage1 = new Mage();
		Heros mage2 = new Mage();
		Heros guerrier1 = new Guerrier();
		Heros guerrier2 = new Guerrier();
		Heros voleur1 = new Voleur();
		Heros voleur2 = new Voleur();

		Mage mage77 = new Mage(); //

		System.out.println("---- BIENVENUE SUR GOD OF WAR ----");
		System.out.println(" ");
		System.out.println("---- Quel est votre nom ?");
		String joueur1 = sc.next();
		j1 = new Joueur(joueur1);

		System.out.println(" ");

		// Donjon Initiation >> 1 Salle - 2 Monstres
		// Salle 1 >> 2 Monstres
		Donjon donjonInitiation = new Donjon("Donjon D'initiation", 1, 2);

		Salle salle1_donjonInitiation = new Salle("Salle D'initiation", 1);
		Monstre ases_z = new Zeus("ASES", "Zeus");
		Monstre gaia_z = new Zeus("GAIA", "Zeus");

		ArrayList<Salle> salles_donjonInitiation = new ArrayList<Salle>();
		System.out.println("Les salles du " + donjonInitiation.getNomDonjon());
		salles_donjonInitiation.add(salle1_donjonInitiation);
		System.out.println(salles_donjonInitiation);

		System.out.println(" ");

		// Deuxième Donjon >> 2 Salle - 3 Monstres
		// Salle 1 >> 2 Monstres
		// Salle 2 >> 1 ennemi
		Donjon deuxiemeDonjon = new Donjon("Deuxieme Donjon", 2, 3);

		Salle salle1_deuxiemeDonjon = new Salle("Salle Du temps ", 2);
		Monstre hades_z = new Zeus("HADES", "Zeus");
		Monstre odin_c = new Cyclope("ODIN", "Titan");

		Salle salle2_deuxiemeDonjon = new Salle("Salle Du Cyclope ", 1);
		Monstre ares_c = new Cyclope("ARES", "Cyclope");

		ArrayList<Salle> salles_deuxiemeDonjon = new ArrayList<Salle>();
		System.out.println("Les salles du " + deuxiemeDonjon.getNomDonjon());
		salles_deuxiemeDonjon.add(salle1_deuxiemeDonjon);
		salles_deuxiemeDonjon.add(salle2_deuxiemeDonjon);
		System.out.println(salles_deuxiemeDonjon);
		salle2_deuxiemeDonjon.getNomSalle();
		System.out.println(" ");

		// Troisieme Donjon >> 2 Salle - 2 Monstres
		// Salle 1 >> 1 ennemi
		// Salle 2 >> 1 ennemi
		Donjon troisiemeDonjon = new Donjon("Troisieme Donjon", 2, 2);

		Salle salle1_troisiemeDonjon = new Salle("Salle De La Vie ", 1);
		Monstre athena_z = new Zeus("ATHENA", "Zeus");

		Salle salle2_troisiemeDonjon = new Salle("Salle Du Titan", 1);
		Monstre baldur_t = new Cyclope("BALDUR", "Titan");
		ArrayList<Salle> salles_troisiemeDonjon = new ArrayList<Salle>();
		System.out.println("Les salles du " + troisiemeDonjon.getNomDonjon());
		salles_troisiemeDonjon.add(salle1_troisiemeDonjon);
		salles_troisiemeDonjon.add(salle2_troisiemeDonjon);
		System.out.println(salles_troisiemeDonjon);

		System.out.println(" ");

		// Boss Donjon >> 1 Salle - 1 Ennemi
		// Salle 1 >> 1 ennemi
		Donjon bossDonjon = new Donjon("Boss Donjon", 2, 2);

		Salle salle1_bossDonjon = new Salle("Salle Du Boss ", 1);
		Monstre magni_b = new Boss("MAGNI_", "Boss");

		ArrayList<Salle> salles_bossDonjon = new ArrayList<Salle>();
		salles_bossDonjon.add(salle1_bossDonjon);
		System.out.println("Les salles du " + bossDonjon.getNomDonjon());
		System.out.println(salles_bossDonjon);

		// ArrayList<String> maListe = new ArrayList<String>();
		// maListe.add("élément 1");

		System.out.println(" ");
		System.out.println("Equipe d'Heros");
		System.out.println(" ");
		System.out.println("---- EQUIPE 1 ----");
		System.out.println("Votre equipe : 1 Mage, 2 Guerriers, 2 Voleurs ");
		System.out.println(" ");
		System.out.println("---- EQUIPE 2 ----");
		System.out.println("Votre equipe : 2 Mages, 1 Guerrier, 2 Voleurs ");
		System.out.println(" ");
		System.out.println("---- EQUIPE 3 ----");
		System.out.println("Votre equipe : 2 Mages, 2 Guerriers, 1 Voleur ");
		System.out.println(" ");
		System.out.println("---- Choisissez votre equipe");
		System.out.println("1 - 2 - 3");

		int choix = sc.nextInt();
//		ArrayList<Joueur> listeHeros = new ArrayList<Joueur>();

		// -- Ajouter chaque Heros dans la liste de Heros du Joueur
		if (choix == 1) {
			System.out.println("---- EQUIPE 1 ----");
			mage1 = new Mage("Laufey", "Mage");
			guerrier1 = new Guerrier("Kratos", "Guerrier");
			guerrier2 = new Guerrier("Atreus", "Guerrier");
			voleur1 = new Voleur("Orkos", "Voleur");
			voleur2 = new Voleur("Brok", "Voleur");
			j1.listeHeros.add(mage1);
			j1.listeHeros.add(guerrier1);
			j1.listeHeros.add(guerrier2);
			j1.listeHeros.add(voleur1);
			j1.listeHeros.add(voleur2);
			System.out.println("liste heros equipe choisie : " + j1.getListeHeros());

		} else if (choix == 2) {
			System.out.println("---- EQUIPE 2 ----");
			mage1 = new Mage("Laufey", "Mage");
			mage2 = new Mage("Mimir", "Mage");
			guerrier1 = new Guerrier("Kratos", "Guerrier");
			voleur1 = new Voleur("Orkos", "Voleur");
			voleur2 = new Voleur("Brok", "Voleur");
			j1.listeHeros.add(mage1);
			j1.listeHeros.add(mage2);
			j1.listeHeros.add(guerrier1);
			j1.listeHeros.add(voleur1);
			j1.listeHeros.add(voleur2);
			System.out.println("liste heros equipe choisie : " + j1.getListeHeros());
		} else if (choix == 3) {
			System.out.println("---- EQUIPE 3 ----");
			mage1 = new Mage("Laufey", "Mage");
			mage2 = new Mage("Mimir", "Mage");
			guerrier1 = new Guerrier("Kratos", "Guerrier");
			guerrier2 = new Guerrier("Atreus", "Guerrier");
			voleur1 = new Voleur("Orkos", "Voleur");
			j1.listeHeros.add(mage1);
			j1.listeHeros.add(mage2);
			j1.listeHeros.add(guerrier1);
			j1.listeHeros.add(guerrier2);
			j1.listeHeros.add(voleur1);
			System.out.println("liste heros equipe choisie : " + j1.getListeHeros());
		} else {
			System.out.println("Choix incorrect");
		}

		pommeAbandonee = new Fruit("Pomme Abandonee", 20, 30); // prix, pvAjoutes
		fruitDuDemon = new Fruit("Fruit Du Demon", 25, 40);
		petitePotion = new Potion("Petite Potion", 35, 50);
		grossePotion = new Potion("Grosse Potion", 45, 70);
		j1.listeObjets.add(pommeAbandonee);
		j1.listeObjets.add(fruitDuDemon);
		j1.listeObjets.add(petitePotion);
		j1.listeObjets.add(grossePotion);
		System.out.println(j1.listeObjets);

		// Entree dans Donjon Initiation, dans ses salles correspondantes
		System.out.println(" ");
		j1.entreeDonjon(donjonInitiation); // entreeDonjon
		j1.entreeSalle(donjonInitiation, salle1_donjonInitiation); // entreeSalle
		j1.combat(ases_z, salle1_donjonInitiation); //
		j1.combat(gaia_z, salle1_donjonInitiation); //
		j1.affichageMenuDonjon(); // Affichage menu Donjon
		j1.retourAuMilieu(); // Retour au milieu (Sortie du Donjon)

		// Entree dans Deuxieme Donjon, dans ses salles correspondantes
		j1.entreeDonjon(deuxiemeDonjon); // entreeDonjon
		j1.entreeSalle(deuxiemeDonjon, salle1_deuxiemeDonjon);
		j1.combat(hades_z, salle1_deuxiemeDonjon);
		j1.combat(odin_c, salle1_deuxiemeDonjon);
		j1.entreeSalle(deuxiemeDonjon, salle2_deuxiemeDonjon);
		j1.combat(ares_c, salle2_deuxiemeDonjon);

		// Entree dans Troisieme Donjon, dans ses salles correspondantes
		j1.entreeDonjon(troisiemeDonjon);
		j1.entreeSalle(troisiemeDonjon, salle1_troisiemeDonjon);
		j1.combat(athena_z, salle1_troisiemeDonjon);
		j1.entreeSalle(troisiemeDonjon, salle2_troisiemeDonjon);
		j1.combat(baldur_t, salle2_troisiemeDonjon);

		// Entree dans Boss Donjon, dans ses salles correspondantes
		j1.entreeDonjon(bossDonjon);
		j1.entreeSalle(bossDonjon, salle1_bossDonjon);
		j1.combat(magni_b, salle1_bossDonjon);

//	  	bossDonjon.listeBossVide(magni_b);

	}

}
