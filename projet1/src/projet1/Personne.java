package projet1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Personne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ville ville = null;
		try {
			 ville = new Ville("Paris", "France", -2000);
		}catch(NombreHabitantException e) {
			
		}
		finally {
			if(ville == null) {
				ville = new Ville();
			}
			System.out.println(ville.decrisToi());
		}
		
		
//		Lecture/Ecriture dans un fichier
		System.out.println("------------------ Traitement de fichier ------------------------");
		
		File file = new File("fileJava.txt");
		System.out.println("Chemin absolu du fichier : " + file.getAbsolutePath());
		System.out.println("Nom du fihier : " + file.getName());
		System.out.println("Est-ce qu'il existe ? : " + file.exists());
		System.out.println("Est-ce un répertoire ? : " + file.isDirectory());
		System.out.println("Est-ce un fichier : ? " + file.isFile());
		

		

/**
 * Les Object ObjectOutputStream
 * et ObjectInputStream
 */
		//Fichier, Object Sérialisable
		//lecture
		ObjectInputStream ois;
		//Ecriture
		ObjectOutputStream oos;
		
		try {
			oos = new ObjectOutputStream(
					new BufferedOutputStream(
							new FileOutputStream(
									new File("game.txt"))));
			//Ecriture de chaque objet Game dans le fichier
			oos.writeObject(new Game("Assasin Creed", "Aventure", 45.69));
			oos.writeObject(new Game("Tomb Raider", "Plateforme", 23.69));
			oos.writeObject(new Game("Mario Card", "Aventure", 35.69));
			//On ferme le fichier
			oos.close();
			
			//On recupère les données 
			ois = new ObjectInputStream(
					new BufferedInputStream(
							new FileInputStream(
									new File("game.txt"))));
			
			try {
				System.out.println("Affichage des jeux : ");
				System.out.println("***********************\n");
				System.out.println(((Game)ois.readObject()).toString());
				System.out.println(((Game)ois.readObject()).toString());
				System.out.println(((Game)ois.readObject()).toString());
				System.out.println("***********************\n");
			}catch(ClassNotFoundException e) {
				e.printStackTrace();
			}
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
/**
 * Code qui teste le temps d'exercution du fichier
 * 
 */
		
//		
//		System.out.println("-------------- Code qui teste le temps d'exercution du fichier ---------------------");
//		
//		//Obj pour lecture 
//		FileInputStream fis;
//		BufferedInputStream bis;
//		
//		//Obj pour Ecriture
//		BufferedOutputStream bos;
//		FileOutputStream fos;
//		
//		try {
//			//Déclaration des objets
//			fis = new FileInputStream(new File("fileJava.txt"));
//			fos = new FileOutputStream(new File("text2.txt"));
//			bis = new BufferedInputStream(new FileInputStream(new File("fileJava.txt")));
//			bos = new BufferedOutputStream(new FileOutputStream(new File("text3.txt")));
//			byte[] buf = new byte[8];
//			//Recupération du temps du temps du système
//			long startTime = System.currentTimeMillis();
//			while(fis.read(buf) != -1) {
//				fos.write(buf);
//			}
//			System.out.println("Temps de la lecture + écriture avec FileInputStream et FileOutputStream : " + (System.currentTimeMillis() - startTime));
//			//On rénitialise 
//			startTime = System.currentTimeMillis();
//			while(bis.read(buf) != -1) {
//				bos.write(buf);
//			}
//			System.out.println("Temps de la lecture et écriture avec BufferedInputStream et BufferedOutputStream : " + (System.currentTimeMillis() - startTime));
//			//Fermeture de nos flux
//			fis.close();
//			bis.close();
//			fos.close();
//			bos.close();
//		}catch(FileNotFoundException e) {
//			e.printStackTrace();
//		}catch(IOException e) {
//			e.printStackTrace();
//		}

//		BufferedInputStream biss = new BufferedInputStream(
//									new DataInputStream(
//											new FileInputStream(
//												new File("fileJava.txt"))));
		
		
		/*Ville villeParis = new Ville("Paris", "France", 123435);
		Ville maVille1 = new Ville();
		
		Capitale cap = new Capitale("Paris", "France", 1230033, "Le Louvre");
		
		System.out.println(cap.decrisToi());
		cap.setMonument("Château de Vincenne");
		System.out.println(cap.decrisToi());*/
		
		//Test class utilisation class abstraite
		
		//Animal loup = new Loup("Blanc", 145);
		Chien chien = new Chien("Blanc", 145);
		chien.deplacement();
		chien.boire();
		chien.crier();
		chien.manger();
		
		System.out.println(chien.toString());
		
		System.out.println("---------------------------------------");
		
		chien.faireCalin();
		chien.faireLebeau();
		chien.faireLechouille();
		
		System.out.println("---------------------------------------");
		
		//Utilisation du polymorphisme de notre Interface
		Rintintin rint = new Chien();
		rint.faireCalin();
		rint.faireLebeau();
		rint.faireLechouille();
		
		
		/*
		//Use getters
		System.out.println(villeParis.getNomPays());
		//Use setters
		villeParis.setNomVille("Belgique");
		
		//New valeur
		System.out.println(villeParis.getNomVille());
		
		//lecture d'entrer du clavier
		Scanner sc = new Scanner(System.in);
		/*System.out.println("Votre Nom et Prenom :");
		String str = sc.nextLine();
		if(str.length() != 0) {
			System.out.println("Vous avez saisi : " + str);
		}else {
			System.out.println("Erreur de saisie");
		}
		
		//recupération du 1er caractère d'une chaine
		System.out.println("Le premier caractère de la chaîne est : " + str.charAt(0));
		
		System.out.println("Quel age avez-vous ?");
		int age = sc.nextInt();
		if(age > 0) {
			System.out.println("Vous avez saisi : " + age + " ans");
		}else {
			System.out.println("Erreur de saisie, pour l'age");
		}
		//permet d'éviter une erreur après utilisation de nextInt()
		sc.nextLine();
		
		//Boucle while et Structure switch
		char reponse = 'O';
		while(reponse == 'O') {
			
			System.out.println("Saisir une salutation : ");
			String chaine = sc.nextLine();
				switch(chaine.toUpperCase()) {//Chaine en Majuscule
					case "BONJOUR":
						System.out.println("Bonjour monsieur : " + str);
						break;
					case "BONSOIR":
						System.out.println("Bonsoir monsieur : " + str);
						break;
					default:
						System.out.println("Hello");
				}
				
				//Sortie de la boucle 
				reponse = ' ';// on réinitialise à vide
				while(reponse != 'O' && reponse != 'N') {
					System.out.println("Voulez-vous réessayer ? (O/N)");
					reponse = sc.nextLine().charAt(0);
				}
				
		}
		
		//Boucle For
		for(int i = 0, j=2 ; (i<10 && j<6); i++, j +=2) {
			System.out.println("i  = " + i + " et J = "+ j);
		}
		
		
		System.out.println("Find de la boucle ...");*/
		
		//TP Conversion Celsius en Fahrenheit
		/*double celsius = 0.0, fahrenheit = 0.0;
		int choix = 1;
		char rpse = 'O';
		
		while(celsius == 0.0 && fahrenheit == 0.0 && rpse == 'O') {
			System.out.println("Choisir un mode de conversion");
			System.out.println("1- Convertisseur Celsius - Fahrenheit");
			System.out.println("2- Convertisseur Fahrenheit - Celsius");
			choix = sc.nextInt();
			switch(choix) {
				case 1:
					System.out.println("Température à convertir : ");
					celsius = sc.nextDouble();
					fahrenheit = (celsius * 9/5) + 32;
					System.out.println(celsius + " °C correspond à " + arrondi(fahrenheit, 1) + " °F");
					break;
				case 2:
					System.out.println("Température à convertir : ");
					fahrenheit = sc.nextDouble();
					celsius = (fahrenheit - 32)*5/9;
					System.out.println(fahrenheit + " °F correspond à " + arrondi(celsius, 1) + " °C");
					break;
				default:
					System.out.println("Impossible de convertir");
			}
			
			rpse = ' ';
			sc.nextLine();
			while(rpse != 'O' && rpse != 'N') {
				System.out.println("Souhaitez-vous convertir une autre température ? (O/N)");
				rpse = sc.nextLine().charAt(0);
				celsius = 0.0;
				fahrenheit = 0.0;
			}
		}
		
		System.out.println("Fin conversion");
		
		//Manipulation des Tableaux
		
		char tabs[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
		char repseTab = 'O';
		while(repseTab == 'O' ) {
			System.out.println("Rentrez une lettre en miniscule");
			char carc = sc.nextLine().toLowerCase().charAt(0);
			
			for(int i = 0; i < tabs.length; i++) {
				if(tabs[i] == carc){
					System.out.println("La lettre '" + carc + "' se trouve bien dans le tableau à l'indice i = " + i + " ");
					repseTab = ' ';
					break;
				}else {
					System.out.println("La lettre '" + carc + "' ne se trouve pas dans le tableau à l'indice i = " + i +" ");
					repseTab = ' ';
				}
			}
			
			while(repseTab != 'O' && repseTab != 'N') {
				System.out.println("Voulez-vous essayer à nouveau ? (O/N)");
				repseTab = sc.nextLine().charAt(0);
			}
		}
		
		System.out.println("Fin de la recherche dans le tableau ");
		
		int tabsEntiers[][] = {{0, 2, 4, 6, 8},{1, 3, 5, 7, 9}};
		
//		for(int i = 0; i < 2; i++) {
//			for(int j = 0; j < 5 ; j++) {
//				System.out.println("Tabs["+i+"]["+j+"] = "+tabsEntiers[i][j]);
//			}
//			
//			System.out.println("-------------------------");
//		}
		System.out.println("----------Tableau 2 dimensions ----------");	
		
		int i = 0, j = 0;
		for(int sousTab[] : tabsEntiers) {
			i = 0;
			for(int intElt : sousTab) {
				System.out.println("La valeur de la nouvelle boucle est : " + intElt);
				System.out.println("Tabs["+j+"]["+i+"] = "+tabsEntiers[j][i]);
				i++;
			}
			j++;
		}
		
		System.out.println("----------Tableau simple une dimension ----------");
		String chaine[] = {"Ariane", "Ludo", "Juju", "Dima", "Yaya"};
	
		System.out.println("----------Call Method Table Content ----------");
		//call method
		tableContent(chaine);
		System.out.println(tableContentToString(chaine));*/
	}
	
	
	public static double arrondi(double A, int B) {
		return (double)((int)(A * Math.pow(10, B) + .5) / Math.pow(10, B));
	}
	
	public static void tableContent(String tab[]) {
		int k = 0;
		for(String elt : tab) {
			System.out.println("chaine["+k+"] = " + elt);
			k++;
		}
	}
	
	public static String tableContentToString(String[] stringTab) {
		String values = "";
		for(String elt : stringTab) {
			 values += elt;
		}

		return values;
	}
}
