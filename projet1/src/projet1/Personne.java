package projet1;

import java.util.Scanner;

public class Personne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//lecture d'entrer de clacier
		Scanner sc = new Scanner(System.in);
		System.out.println("Votre Nom et Prenom :");
		String str = sc.nextLine();
		if(str.length() != 0) {
			System.out.println("Vous avez saisi : " + str);
		}else {
			System.out.println("Erreur de saisie");
		}
		
		//recup�ration du 1er carac d'une chaine
				System.out.println("Le premier caract�re de la cha�ne est : " + str.charAt(0));
		
		System.out.println("Quel age avez-vous ?");
		int age = sc.nextInt();
		if(age > 0) {
			System.out.println("Vous avez saisi : " + age + " ans");
		}else {
			System.out.println("Erreur de saisie, pour l'age");
		}
	}
}
