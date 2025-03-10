package com.java.practise.basics;

public class CommonClass {
	public static void main(String[] args) {
		Shapes si = new Circles();
		si.draw();
		//System.out.println("This is " +si);
		Shapes sp = new Rectangle();
		sp.draw();
		//System.out.println("This is " +si);
		
		Playable pl = new Guitar();
		pl.play();
		Playable pl2 = new Piano();
		pl2.play();
		
	}

}
