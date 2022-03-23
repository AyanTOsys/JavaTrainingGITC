
public class ChildTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GrandFather gfObj = new GrandFather();
		gfObj.farming();
		
		Father fObj = new Father();
		fObj.farming();
		fObj.banking();
		
		Child cObj = new Child();
		cObj.farming();
		cObj.banking();
		cObj.programming();
	}

}

class GrandFather{
	GrandFather(){
		System.out.println("Grandfather ctor is called..");
	}
	
	void farming() {
		System.out.println("Grandfather is farming with bull");
		System.out.println("========================================");
	}
}

class Father extends GrandFather{
	Father(){
		System.out.println("Father ctor is called..");
	}
	void farming() {
		System.out.println("Father is farming with tractor");
	}
	void banking() {
		System.out.println("Father is banking offline");
		System.out.println("========================================");
	}
}

class Child extends Father{
	Child(){
		System.out.println("Child ctor is called..");
	}
	void farming() {
		System.out.println("Child is farming with robo tractor");
	}
	void banking() {
		System.out.println("Child is banking online");
	}
	void programming() {
		System.out.println("Child is programming java");
		System.out.println("========================================");
	}
}