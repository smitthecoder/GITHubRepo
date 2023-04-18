
public class Demo3 {
	public static void main(String[] args) {
		System.out.println("First main method");
	}
	public static void main() {
		System.out.println("Second: overloaded main method");
	}
	public static void main(int a) {
		System.out.println("Third: overloaded main method");
		System.out.println("Made a new change in the Demo 3");
	}
}
