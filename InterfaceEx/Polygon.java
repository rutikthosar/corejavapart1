package InterfaceEx;

public interface Polygon {
	void getArea(int length, int breadth);

}

class Rectangle implements Polygon{

	@Override
	public void getArea(int length, int breadth) {
		// TODO Auto-generated method stub
		System.out.println("the area of the rectangle is: " + (length*breadth));
	}
}
