package ex4;
import ex4.CompteBancaire;
import java.util.ArrayList;

public class Personne {
	private int nbcompte=0;
	private String nom;
	private CompteBancaire[] comptes=new CompteBancaire[10];
	
	public void retirerargent(int x,CompteBancaire c1,CompteBancaire c2)
	{
		c1.debiter(x);
		c2.crediter(x);
	}
	
	public void ajoutercompte(CompteBancaire c)
	{
		comptes[nbcompte]=c;
		nbcompte++;
	}

	public Personne(String nom) {
		this.nbcompte = 0;
		this.nom = nom;
	}
	
	
}
