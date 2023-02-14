package ex4;

public class CompteBancaire {
	
	private int num,solde;
	private String p;
	public CompteBancaire(int num, int solde, String p) {
		this.num = num;
		this.solde = solde;
		this.p = p;
	}
	@Override
	public String toString() {
		return "CompteBancaire [num=" + num + ", solde=" + solde + ", nom=" + p + "]";
	}
	
	public void crediter(int s)
	{
		solde+=s;
	}
	
	public void debiter(int s)
	{
		solde-=s;
	}
	
	

}
