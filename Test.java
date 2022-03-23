
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tiger tObj = new Tiger();
		
		tObj.roar();
		
		tObj.hunt("Deer");
		
		int c = tObj.jump(7, 8);
		System.out.println("Tiger covered.."+c+" feet area");
		
		int s = tObj.swimming();
		System.out.println("Tiger swam : "+s+" meters");
		
		
		Car cObj = new Car();
		cObj.start();
		cObj.Stop();
		cObj.startAC(2);
		
		int distanTravel = cObj.disTravel();
		System.out.println("Your car has travelled "+distanTravel+" KM today..");
		
		float carSpeed = cObj.speedOfCar(100,3);
		System.out.println("Your car average speed was "+carSpeed+"..drive carefully!");
	}
}

class Tiger{
	void roar() {
		System.out.println("Tiger is roaring..");
	}
	
	void hunt(String theHuntedAnimal) {
		System.out.println("Tiger is hunting "+theHuntedAnimal);
	}
	
	int jump(int length, int height) {
		System.out.println("Tiger is jumping..");
		int cover = length*height;
		return cover;
	}
	
	int swimming() {
		System.out.println("Tiger is swimming..10 meters");
		return 10;
	}
}

class Car{
	void start() {
		System.out.println("The car is switched on..");
	}
	
	void Stop() {
		System.out.println("The car is stopped");		
	}
	
	void startAC(int x) {
		System.out.println("The AC has been switched on at "+x+" level");
	}
	
	int disTravel() {
		int distance = 100;
		return distance;
	}
	
	float speedOfCar(int km, int hr) {
		float speed = km/hr;
		return speed;
	}
}
