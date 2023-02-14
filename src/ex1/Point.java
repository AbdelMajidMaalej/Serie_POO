package ex1;

import java.util.Objects;

public class Point {
	private int cordx,cordy;
	private String couleur,nom;
	
	public Point() {
	}

	public Point(int cordx, int cordy) {
		this.cordx = cordx;
		this.cordy = cordy;
	}

	public Point(int cordx, int cordy, String couleur, String nom) {
		this.cordx = cordx;
		this.cordy = cordy;
		this.couleur = couleur;
		this.nom = nom;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void changerx(int dx)
	{
		cordx+=dx;
	}
	
	public int getx(int x)
	{
		return x;
	}
	
	public int gety(int y)
	{
		return y;
	}
	
	public void changery(int dy)
	{
		cordy+=dy;
	}
	
	public void deplacerpoint(int dx,int dy)
	{
		changerx(dx);
		changery(dy);
	}
	
	public void changercouleur(String color)
	{
		couleur=color;
	}

	@Override
	public String toString() {
		return "Point [cordx=" + cordx + ", cordy=" + cordy + "]";
	}
	
	
	
	
	
	

}
