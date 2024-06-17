package activity1;

public class car {

		String color;
		String transmission;
		int make;
		int tyres;
		int doors;
				
	
	public car() {
		tyres=4;
		doors=4;
				
	}
	
	public void displaycharacteristics() {
		System.out.println(tyres);
		System.out.println(doors);
	}
	public void accelerate() {
		System.out.println("Car is moving forward");
	}
	public void brake() {
		System.out.println("Car has stopped");
	}
	
	
		

}
