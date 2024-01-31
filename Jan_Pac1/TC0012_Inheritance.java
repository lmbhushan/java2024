package Jan_Pac1;
class Base_Parent
{
	public void basemethod() {
		System.out.println("This is Parent");
	}
}

class Derived_Child extends Base_Parent{
	public void derivedmethod()
	{
		super.basemethod();
		System.out.println("This is Child");
	}
}

public class TC0012_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Derived_Child child1=new Derived_Child();
     child1.derivedmethod();
    if(child1 instanceof Base_Parent)
    {
      System.out.println("Yes");	
    }
    else
    {
      System.out.println("No");	
    }
	}

}
