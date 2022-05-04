package Com.wipro;

public class StudentMarks {
	public static void main(String[] args) {
		System.out.println(StudentMarks.calculateMarks(98.58f, 98.56f, 99.97f, 98.08f));
	}
	/* adding 4 integer values. */

	public int calculateMarks(int physics, int chemistry, int maths) {
		int total = physics + chemistry + maths;

		return total;
	}

	/* adding 3 integer values. */
	public int calculateMarks(int physics, int chemistry, int maths, int bio) {

		int total = physics + chemistry + maths + bio;
		return total;
	}

	/* adding 4 double values. */
	public double calculateMarks(double physics, double chemistry, double maths, double bio) {
		double total = physics + chemistry + maths + bio;
		return total;
	}

	/* static method adding 5 float values. */
	public static float calculateMarks(float maths, float bio, float physics, float chemistry, float lang) {
		float total = physics + chemistry + maths + bio + lang;
		return total;
	}

	/* adding 4 float values with order changed. */
	public static float calculateMarks(float maths, float bio, float physics, float chemistry) {
		float total = physics + chemistry + maths + bio;
		return total;
	}

}
