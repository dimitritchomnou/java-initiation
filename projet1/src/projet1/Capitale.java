package projet1;

public class Capitale extends Ville{
	private String monument;
 public Capitale(String monument) {
	 super();
	 this.monument = monument;
 }
 
 public Capitale(String nom, String pays, int hab, String monument) throws NombreHabitantException{
	 super(nom, pays, hab);
	 this.monument = monument;
 }
 
 public String getMonument() {
	 return this.monument;
 }
 
 public void setMonument(String monument) {
	 this.monument = monument;
 }
 
 public String decrisToi() {
	 String chaine = super.decrisToi() + " \n \t ==>>" + this.monument + " en est un monument";
	 System.out.println("Invocation de super.decrisToi()");
	 return chaine;
 }
}
