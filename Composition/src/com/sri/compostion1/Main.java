package com.sri.compostion1;

public class Main {
	
	public static void main(String args[]) {
//		Job job = new Job("Software engineer", 85000, 1010);
//		Person person = new Person("Srinath", job);
//		person.getDetails();
		
	    	
		
    	Wall wall1 = new Wall("West");
     	Wall wall2 = new Wall("East");
    	Wall wall3 = new Wall("South");
     	Wall wall4 = new Wall("North");
	
		Ceiling ceiling = new Ceiling(12, 55);
		Bed bed = new Bed("Modern", 4, 3, 2,1);
		Lamp lamp = new Lamp("Classic", false, 75);
		
		Room room = new Room("Tims", wall1, wall2, wall3, wall4,ceiling, bed, lamp);
		room.makeBed();
		room.getLamp().turnOn();
		
	}

}
