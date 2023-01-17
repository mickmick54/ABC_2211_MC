package de;

import java.util.Random;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rand = new Random();
		
		int result = rand.nextInt(6) + 1;
		
		System.out.println("Valeur du dé : " + result);
	}

}
