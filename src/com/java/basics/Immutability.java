package com.java.basics;

final class Immutability {
	
	public final String name;
	public String getName() {
		return name;
	}

	public int getID() {
		return ID;
	}

	public final int ID;
	
	Immutability(String name,int ID){
		this.name = name;
		this.ID = ID;
	}
	

}
