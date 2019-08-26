package interview;

public class Test1 {

	public static void main(String[] args) {
		String S1="abc";
		String S2=S1;
		S1+="d";
		System.out.println(S1+" "+S2+" "+(S1==S2));
		StringBuffer sb1= new StringBuffer("abc");
		StringBuffer sb2=sb1;
		sb1.append("d");
		System.out.println(S1+" "+S2+" "+(S1==S2));
	}
}
