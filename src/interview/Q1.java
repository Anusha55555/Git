package interview;

public class Q1 {
 static int num=100;
 
 public void calc(int num) {
	// TODO Auto-generated method stub
this.num=num*10;

}
 
 public void num() {
	// TODO Auto-generated method stub
System.out.println(num);
}
 
 public static void main(String[] args) {
	
	 Q1 ob = new Q1();
	 ob.calc(2);
	 ob.num();
}
}
