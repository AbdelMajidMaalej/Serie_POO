package ex4;
import ex4.CompteBancaire;
import ex4.Personne;

public class Main {

	public static void main(String[] args) {
		CompteBancaire c1=new CompteBancaire(1,0,"Majid");
		CompteBancaire c2=new CompteBancaire(2,0,"Majid");
		Personne p=new Personne("Majid");
		p.ajoutercompte(c2);
		p.ajoutercompte(c1);
		System.out.println(c1);
		System.out.println(c2);
		p.retirerargent(200, c1, c2);
		System.out.println(c1);
		System.out.println(c2);
		
	}

}
