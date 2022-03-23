
public class ConstructorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Camera camObj1=new Camera(10);
		Camera camObj2=new Camera(20);
		Camera camObj3=new Camera(30);
		
		camObj1.setCamera(40);
		camObj2.setCamera(50);
		camObj3.setCamera(60);
	}
}

class Camera{
	int megaPixel;
	int cameraID;
	String cameraBrand;
	float cost;
	
	Camera(int megaPixel){
		System.out.println("Camera is constructed...");
		this.megaPixel=megaPixel;
	}
	
	
	
	void setCamera(int megaPixel) {
		System.out.println("Camera is constructed...");
		this.megaPixel=megaPixel;
	}
}
