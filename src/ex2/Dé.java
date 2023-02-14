package ex2;

public class Dé {
	private int nbFace;
	
	public int random()
	{
		return (int) (1+ Math.random()*(nbFace-1));
	}
	public Dé(int nb)
	{
		nbFace=nb;
	}

}
