package method_overloading;
public class Method_Overloading {
	public static void main(String[] args) {
		quardatic(4);
		quardatic(4,5);
		quardatic("Manthan");
		quardatic("Manthan","Shevlkar");
		quardatic("Manthan",5);
		quardatic(5,"Manthan");
		
	}
	public static void quardatic() {
		System.out.println("Output when there is empty brackets");
	}
	public static void quardatic(int a) {
		System.out.println("Output when the int a is called");
	}
	public static void quardatic(String a) {
		System.out.println("Output when string a is called");
	}
	public static void quardatic(String a,String b) {
		System.out.println("Output when both the string is called");
		String c = a + b;
		System.out.println(" "+c);
	}
	public static void quardatic(int a, int b) {
		System.out.println("Output when both the int is called");
		int c = a/a;
		c = c + (2/a/b);
		c = c + b / b;
		System.out.println("Output is "+c);
	}
	public static void quardatic(String a, int b) {
		System.out.println("Output when string a and int b as passed");
	}
	public static void quardatic(int a, String b) {
		System.out.println("Output when int a and String b as been called");
	}
}