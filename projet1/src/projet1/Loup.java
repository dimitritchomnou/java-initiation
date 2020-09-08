package projet1;

public class Loup extends Canin{
	public Loup() {
		
	}
	
	public Loup(String couleur, int poids) {
		this.poids = poids;
		this.couleur = couleur;
	}
	
	void crier() {
		System.out.println("je hurle à la lune en faisant ouhouh");
	}
	
}
