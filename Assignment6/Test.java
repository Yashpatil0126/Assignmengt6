package Assignment6;

class A {
	public static void print() {
		System.out.println("Parent");
	}
}

class B extends A {
	public static void print() {
		System.out.println("Child");
	}
}

public class Test {

	public static void main(String[] args) {
		A obja = new A();
		obja.print();
		System.out.println("==========");
		B objb = new B();
		objb.print();
		System.out.println("==========");
		obja = new B();
		obja.print();

	}

}
