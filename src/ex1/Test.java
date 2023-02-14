package ex1;
import ex1.Point;

public class Test {

	public static void main(String[] args) {
		Point point = new Point(1,3);
		System.out.println(point);
		point.deplacerpoint(4, 4);
		System.out.println(point);
	}

}
