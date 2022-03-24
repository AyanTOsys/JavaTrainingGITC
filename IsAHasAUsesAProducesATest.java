
public class IsAHasAUsesAProducesATest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CoconutTree ctObj = new CoconutTree();
		Soil sObj = new Soil();
		Water wObj = new Water();
		Sunlight sunObj = new Sunlight();
		
		ctObj.grow(sObj, wObj, sunObj);
		
		Coconut cObj = ctObj.getCoconut();
		CoconutWater cwObj = ctObj.breakCoconut();
		
		Leaves lObj = new Leaves();
		lObj.setFire();
	}

}

class LivingThing{
	
}
class Tree extends LivingThing{//isA
	
}
class CoconutTree extends Tree{//isA
	int treeID;
	
	void grow(Soil s, Water w, Sunlight sun) {//usesA
		System.out.println("Coconut tree is growing by the help of "+s+","+w+","+sun);
	}
	
	Leaves lObj = new Leaves();//hasA	
	
	
	Coconut getCoconut() {
		System.out.println("A lot of coconuts..");
		Coconut cObj = new Coconut();
		return cObj;
	}
	
	CoconutWater breakCoconut() {//producesA
		CoconutWater cwObj = new CoconutWater();
		System.out.println("Coconut is broken..So sweet and cool water!!");
		return cwObj;
	}
	
	
}

class Leaves{
	void setFire() {
		System.out.println("Coconut leaves are source for ignition");
	}
}

class Coconut{
	
}

class Soil{
	
}
class Water{
	
}
class Sunlight{
	
}
class CoconutWater{
	
}
