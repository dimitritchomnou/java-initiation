package projet1;

public class Ville{
	protected String nomVille;
	private String nomPays;
	int nbreHabitants;
	
	public Ville() {
		
	}
	
	public Ville(String nomVille, String nomPays, int nbreHabitants) throws NombreHabitantException {
			if(nbreHabitants < 0) {
				throw new NombreHabitantException(nbreHabitants);
			}else {
				System.out.println("Création d'une ville");
				this.nomVille = nomVille;
				this.nomPays = nomPays;
				this.nbreHabitants = nbreHabitants;
			}
		}
		
	
	//*************   ACCESSEURS *************
	
	public String getNomVille() {
		return nomVille;
	}
	
	public String getNomPays() {
		return nomPays;
	}
	
	public int getNbreHabitants() {
		return nbreHabitants;
	}
	
	//*************   MUTATEURS *************
	
	public void setNomVille(String nomVille) {
		this.nomVille = nomVille;
	}
	
	public void setNomPays(String nomPays) {
		this.nomPays = nomPays;
	}
	
	public void setNbreHabitants(int NbreHabitants) {
		this.nbreHabitants = NbreHabitants;
	}
	
	public String decrisToi() {
		return this.nomVille + " est une ville de " + this.nomPays + " , elle comporte : " +
				this.nbreHabitants + " habitants";
	}
	
	
	
}
