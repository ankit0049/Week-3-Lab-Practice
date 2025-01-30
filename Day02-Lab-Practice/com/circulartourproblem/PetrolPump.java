package com.circulartourproblem;

// Class to represent a petrol pump with petrol and distance to the next pump
class PetrolPump {
	// Amount of petrol available at the current petrol pump
	int petrol;
	// Distance to the next petrol pump
	int distance;

	// Constructor to initialize a petrol pump with petrol and distance
	public PetrolPump(int petrol, int distance) {
		this.petrol = petrol;
		this.distance = distance;
	}
}
