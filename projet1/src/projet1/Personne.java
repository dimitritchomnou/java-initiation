package projet1;

import java.util.Scanner;

public class Personne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//lecture d'entrer du clavier
		Scanner sc = new Scanner(System.in);
		System.out.println("Votre Nom et Prenom :");
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
		
		System.out.println("Au revoir ...");
			
	}
}
