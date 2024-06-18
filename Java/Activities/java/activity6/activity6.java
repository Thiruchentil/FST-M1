package activity6;

public class activity6 {
	public static void main(String[] args) throws InterruptedException {
		Plane plane = new Plane(10);
		plane.onboard("Ashok");
		plane.onboard("Jeeva");
		plane.onboard("Mani");
		System.out.println(plane.takeOff());
		System.out.println(plane.getPassengers());
		Thread.sleep(5000);
		plane.land();
		System.out.println(plane.getLastTimeLanded());
		System.out.println(plane.getPassengers());
	}

}
