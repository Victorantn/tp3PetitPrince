package petitPrince;

import asteroide.Sujet;
import asteroide.console.ConsoleJavaBoy;

public class PetitPrince0 implements Sujet{
	private String nom;
	private int argent;
	private ConsoleJavaBoy console;
	private int cpt = 0;
	
	public PetitPrince0() {
		this.nom = "Prince";
		this.argent = 10;
		this.console = new ConsoleJavaBoy(this);
	}
	
	public String getNom() {
		return nom;
	}
	
	public int getArgent() {
		return argent;
	}
	
	public void run() {
		this.console.parler("Je m'appelle " + this.getNom() + " et je suis un petit Prince.");
		this.console.seDirigerVers(0);
		cpt ++;
	}
}

