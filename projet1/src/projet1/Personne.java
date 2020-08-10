package projet1;

import java.util.Scanner;

public class Personne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//lecture d'entrer du clavier
		Scanner sc = new Scanner(System.in);
		/*System.out.println("Votre Nom et Prenom :");
		String str = sc.nextLine();
		if(str.length() != 0) {
			System.out.println("Vous avez saisi : " + str);
		}else {
			System.out.println("Erreur de saisie");
		}
		
		//recup�ration du 1er caract�re d'une chaine
		System.out.println("Le premier caract�re de la cha�ne est : " + str.charAt(0));
		
		System.out.println("Quel age avez-vous ?");
		int age = sc.nextInt();
		if(age > 0) {
			System.out.println("Vous avez saisi : " + age + " ans");
		}else {
			System.out.println("Erreur de saisie, pour l'age");
		}
		//permet d'�viter une erreur apr�s utilisation de nextInt()
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
				reponse = ' ';// on r�initialise � vide
				while(reponse != 'O' && reponse != 'N') {
					System.out.println("Voulez-vous r�essayer ? (O/N)");
					reponse = sc.nextLine().charAt(0);
				}
				
		}
		
		//Boucle For
		for(int i = 0, j=2 ; (i<10 && j<6); i++, j +=2) {
			System.out.println("i  = " + i + " et J = "+ j);
		}
		
		
		System.out.println("Find de la boucle ...");*/
		
		//TP Conversion Celsius en Fahrenheit
		double celsius = 0.0, fahrenheit = 0.0;
		int choix = 1;
		char rpse = 'O';
		
		while(celsius == 0.0 && fahrenheit == 0.0 && rpse == 'O') {
			System.out.println("Choisir un mode de conversion");
			System.out.println("1- Convertisseur Celsius - Fahrenheit");
			System.out.println("2- Convertisseur Fahrenheit - Celsius");
			choix = sc.nextInt();
			switch(choix) {
				case 1:
					System.out.println("Temp�rature � convertir : ");
					celsius = sc.nextDouble();
					fahrenheit = (celsius * 9/5) + 32;
					System.out.println(celsius + " �C correspond � " + arrondi(fahrenheit, 1) + " �F");
					break;
				case 2:
					System.out.println("Temp�rature � convertir : ");
					fahrenheit = sc.nextDouble();
					celsius = (fahrenheit - 32)*5/9;
					System.out.println(fahrenheit + " �F correspond � " + arrondi(celsius, 1) + " �C");
					break;
				default:
					System.out.println("Impossible de convertir");
			}
			
			rpse = ' ';
			sc.nextLine();
			while(rpse != 'O' && rpse != 'N') {
				System.out.println("Souhaitez-vous convertir une autre temp�rature ? (O/N)");
				rpse = sc.nextLine().charAt(0);
				celsius = 0.0;
				fahrenheit = 0.0;
			}
		}
		
		System.out.println("Fin conversion");
			
	}
	
	public static double arrondi(double A, int B) {
		return (double)((int)(A * Math.pow(10, B) + .5) / Math.pow(10, B));
	}
}
