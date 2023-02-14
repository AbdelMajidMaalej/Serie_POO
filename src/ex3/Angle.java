package ex3;
import ex3.AngleInvalidException;

public class Angle {
	
	private int angle=(int)(Math.random()*360);
	public void tester(int t) throws AngleInvalidException
	{
		if (t<0 || t>30)
			throw new AngleInvalidException("Valeur non permise");
	}
	
	public void addition(int x)
	{
		try 
		{
			angle+=x;
			tester(angle);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public void tangente()
	{
		System.out.println("Tang("+angle+") = "+Math.tan(angle));
	}
	
	public void sinus()
	{
		System.out.println("Tang("+angle+") = "+Math.sin(angle));
	}
	
	public void cosinus()
	{
		System.out.println("Tang("+angle+") = "+Math.cos(angle));
	}
	
	public double conversion()
	{
		return (angle/180 * Math.PI);
	}
	
	public void soustraction(int x)
	{
		angle-=x;
	}
	
	public void multiplication(int x)
	{
		angle*=x;
	}

	@Override
	public String toString() {
		return "Angle [angle=" + angle + "]";
	}
	
	
	

}
