
public class AssignmentDay4Association {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trading tradeObj =new Trading();
		Toy tObj = new Toy();
		Shirt sObj = new Shirt();
		Vehicle vObj = new Vehicle();
		tradeObj.makeMoney(tObj, sObj, vObj);
	}

}
class Company{
	ReportCard rcobj = new ReportCard();
}
class ReportCard{
	
}
class Restaurant extends Company{
	
}
class KFC extends Restaurant{
	Branch brObj = new Branch();
	
	Food produceFood() {
		Food foodObj = new Food();
		return foodObj;
	}
	
	GasBill produceGasBill() {
		GasBill gbObj = new GasBill();
		return gbObj;
	}
	
	Feedback fbObj = new Feedback();
	Airconditioner acObj = new Airconditioner();
}
class Branch{
	
}
class Food{
	
}
class GasBill{
	
}
class Feedback{
	
}
class Airconditioner{
	
}
class Hotel extends Company{
	ClassRoom crObj = new ClassRoom();
}

class ClassRoom{
	Library lbObj = new Library();
	Aquarium aqObj = new Aquarium();
	Book bObj = new Book();
	Laptop lpObj =new Laptop();
}
class Library{
	
}
class Aquarium{
	
}
class Book{
	HolidayHome hhObj =new HolidayHome();
	Movie mObj =new Movie();
	LearningGuitar lgObj = new LearningGuitar();
}
class HolidayHome{
	
}
class Movie{
	
}
class LearningGuitar{
	
}
class Trading{
	void makeMoney(Toy tObj, Shirt sObj, Vehicle vObj) {
		System.out.println("We have trading of toys, shirts, vehicles");
	}
}
class Toy{
	
}
class Shirt{
	
}
class Vehicle{
	
}
class TwoWheeler extends Vehicle{
	
}
class Laptop{
	
}