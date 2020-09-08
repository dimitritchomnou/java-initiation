package projet1;

public class NombreHabitantException extends Exception{
	public NombreHabitantException(int nbre) {
		System.out.println("Vous essayer d'instancier une classe Ville avec un  nombre d'habitants négatifs ! " + nbre);
	}
}
