package Inheritance_3;

public class FourWheeler extends Vehicle{
	private String audioSystem;
	private int numberOfDoors;
	
	public String getAudioSystem() {
		return audioSystem;
	}

	public void setAudioSystem(String audioSystem) {
		this.audioSystem = audioSystem;
	}

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

	public FourWheeler(String make, String vehicalNumber, String fuelType, int fuelCapacity, int cc, String audioSystem,
			int numberOfDoors) {
		super(make, vehicalNumber, fuelType, fuelCapacity, cc);
		this.audioSystem = audioSystem;
		this.numberOfDoors = numberOfDoors;
	}

	public void displayDetailInfo() {
		System.out.println("Audio System: "+this.getAudioSystem());
		System.out.println("Number of doors: "+this.getNumberOfDoors());
	}
}
