package Com.wipro;

// program for method overloading
// same method with different type of  arguments
public class PolyEx {
	public static void main(String[] args) {

		System.out.println(Example.Multiply(2, 5));
		System.out.print(Example.Multiply(2.3f, 3.5f));

	}

	class Example {
		public static int Multiply(int a, int b) {
			return a * b;
		}

		public static float Multiply(float a, float b) {
			return a * b;
		}
	}
}
