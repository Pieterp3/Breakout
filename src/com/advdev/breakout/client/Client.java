package com.advdev.breakout.client;

public class Client {

	private static Client client = new Client();//TODO: This line starts program

	
	private Client() {
		
	}

	

	public static Client getInstance() {
		return client;
	}
	
	
	public static void main(String[] args) {
	}

}
