
public class DogTest {

	public static void main(String[] args) {
		
		System.out.println("Begin main...");
		try {
			Dog dogObj = new Dog(-5,"/-*/-/");
			System.out.println("Dog details.."+dogObj);
		} 
		catch (DogAgeExceededException e) {
			System.out.println("Exception handler 1"+e);
			e.printStackTrace();
		}
		catch(DogAgeNegativeException e) {
			System.out.println("Exception handler 2"+e);
			e.printStackTrace();
		}
		catch(DogNameInvalidException e) {
			System.out.println("Exception handler 3"+e);
			e.printStackTrace();
		}
		System.out.println("End main..");
	}

}

class DogAgeExceededException extends Exception{
	DogAgeExceededException(String str){
		super(str);
	}
}

class DogAgeNegativeException extends Exception{
	DogAgeNegativeException(String str){
		super(str);
	}
}
class DogNameInvalidException extends Exception{
	DogNameInvalidException(String str){
		super(str);
	}
}

class Dog{
	int age;
	String name;
	public Dog(int age, String name) throws DogAgeExceededException,DogAgeNegativeException,DogNameInvalidException{
		super();
		System.out.println("Dog ctor started...");
		if (age > 14) 
			throw new DogAgeExceededException("Dogs age cannot exceed 14");
		
		else if (age < 0)
			throw new DogAgeNegativeException("Dog age cannot be negetive");
		else 
			this.age = age;
		
		if (name.matches("[a-zA-z]+"))
			this.name = name;
		else 
			throw new DogNameInvalidException("Dog name invalid");
		
		System.out.println("Dog ctor finished");
	}
	@Override
	public String toString() {
		return "Dog [age=" + age + ", name=" + name + "]";
	}	
}