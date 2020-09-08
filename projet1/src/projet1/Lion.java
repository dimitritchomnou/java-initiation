package projet1;

public class Lion extends Felin{
	
	public Lion() {
		
	}
	
	public Lion(String couleur, int poids) {
		this.poids = poids;
		this.couleur = couleur;
	}
	
	void crier() {
		System.out.println("Je rugis dans la savane");
	}
}
