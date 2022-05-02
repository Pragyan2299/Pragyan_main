package Com.wipro;

// Main class
public class Poly2 {
	public static void main(String[] args) {
		// Creating object of class 2
		Parent a = new SubClass1();
		a.Print();
	}
}
// class 2
	class Parent {
		void Print() {
			System.out.println("Parent");
		}
	}

// class 3
	class SubClass1 extends Parent {
		void Print() {
			System.out.println("subclass");
		}
	}

