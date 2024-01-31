package Jan_Pac1;

abstract class Shapes
{
	abstract void draw();
}

class rectangle extends Shapes
{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Draw the Rectangle");
	}
	
}

public class Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
rectangle r1=new rectangle();
r1.draw();
	}

}
