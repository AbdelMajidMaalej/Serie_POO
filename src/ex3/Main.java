package ex3;
import ex3.Angle;

public class Main {

	public static void main(String[] args) {
		Angle angle = new Angle();
		System.out.println(angle);
		System.out.println(angle.conversion()+" PI");
		angle.cosinus();
		angle.tangente();
		angle.addition(300);
		angle.multiplication(2);
		System.out.println(angle);
		
	}

}
