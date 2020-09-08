package projet1;

public abstract class Animal {
	protected int poids;
	protected String couleur;
	
	protected void manger() {
		System.out.println("Je mange");
	}
	
	protected void boire() {
		System.out.println("Je bois de l'eau");
	}
	
	abstract void deplacement();
	abstract void crier();
	
	public String toString() {
		return("Je suis un objet de la " + this.getClass() + ", je suis " + 
		this.couleur +	", je pèse " + this.poids);
	}
}
