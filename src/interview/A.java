package interview;

public class A {
	 int a=5;
	static int b=5;
	
	
	A()
	{
		a++;
		b++;
		
	 System.out.println(a);
	 System.out.println(b);

}

	public static void main(String[] args) {
		A ob1= new A();
		A ob2=new A();
		A ob3= new A();
	}
	
}