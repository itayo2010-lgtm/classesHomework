package projectClasses;

public class TestRational {

	public static void main(String[] args) {
		
		Rational r1 = new Rational(2, 4);
		Rational r2 = new Rational(6, 7);

		System.out.println(r1.tostring());
		System.out.println(r1.isEqual(r2));
		System.out.println(r1.multiply(r2));
		System.out.println(r1.divide(r2));
		System.out.println(r1.plus(r2));
		System.out.println(r1.minus(r2));


	}

}
