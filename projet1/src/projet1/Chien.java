package projet1;

public class Chien extends Canin implements Rintintin{

		public Chien() {
			
		}
		
		public Chien(String couleur, int poids) {
			this.couleur = couleur;
			this.poids = poids;
		}
		
		void crier() {
			System.out.println("J'aboie sans raison");
		}
		
		public void faireCalin() {
			System.out.println("Je fais un gros c�lin");
		}
		
		public void faireLebeau() {
			System.out.println("Je fais le beau");
		}
		
		public void faireLechouille() {
			System.out.println("Je fais de grosses l�chouilles...");
		}

}
