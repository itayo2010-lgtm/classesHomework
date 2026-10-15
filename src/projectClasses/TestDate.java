package projectClasses;

public class TestDate {

	public static void main(String[] args) {
		
		Date d1 = new Date(2, 6, 2012);
		Date d2 = new Date(5, 3, 2003);

		System.out.println(d1.tostring());
		System.out.println(d2.tostring());

		d1.setMonth(3);
		d2.setYear(2012);
		
		System.out.println(d1.compareTo(d2));
		
		d2.setDay(2);
		
		System.out.println(d1.compareTo(d2));
	}

}
