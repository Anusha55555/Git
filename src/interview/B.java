package interview;

public class inheritance {
	
	inheritance()
	{
		System.out.println("parentclass");
	}

}


public class B  extends inheritance
{
	B()
	{
		super();
		
		System.out.println("Childclasss");
	}
	
	
	

public static void main(String[] args) {
	B ob= new B();
}



}