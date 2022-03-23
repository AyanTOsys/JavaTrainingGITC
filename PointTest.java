
public class PointTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point2D twoObj = new Point2D();
		twoObj.setPoint2D(100,200);
		
		Point3D threeObj = new Point3D();
		threeObj.setPoint3D(50,100,150);
		
		Point4D fourObj = new Point4D();
		fourObj.setPoint4D(10, 20, 30, 40);
	}

}

class Point2D{
	int x;
	int y;
	
	void setPoint2D(int x, int y) {
		this.x=x;
		this.y=y;
		System.out.println("Setting 2D point at "+x+", "+y);
		System.out.println("===============================");
	}
}

class Point3D extends Point2D{
	int z;

	void setPoint3D(int x, int y,int z) {
		super.setPoint2D(x, y);
		this.z=z;
		System.out.println("Setting 3D point at "+z);
		System.out.println("===============================");
	}
}

class Point4D extends Point3D{
	int f;

	void setPoint4D(int x, int y,int z, int f) {
		super.setPoint3D(x, y,z);
		this.f=f;
		System.out.println("Setting 4D point at "+f);
		System.out.println("===============================");
	}
}

