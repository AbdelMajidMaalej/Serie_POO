package ex2;
import ex2.Dé;

public class Jeu {

	public static void main(String[] args) {
		int pta=0,ptb=0,i=0;
		Dé A=new Dé(6);
		Dé B=new Dé(6);
		
		while (pta<21 && ptb<21 && i<10)
		{
			pta+=A.random();
			ptb+=B.random();
			i++;
		}
		if (pta>ptb)
			System.out.println("Le gagnant est A avec "+pta+" points contre B avec "+ptb);
		else if(pta<ptb)
			System.out.println("Le gagnant est B avec "+ptb+" points contre A avec "+pta);
		else System.out.println("Draw avec "+pta+" de points");
			
		

	}

}
