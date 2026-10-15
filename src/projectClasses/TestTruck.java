package projectClasses;

public class TestTruck {

	public static void main(String[] args) {
		
		Truck t1 = new Truck(42, "joe", "A12345");
		Truck t2 = new Truck(53, "mike", "B67891");

		System.out.println(t1.moreStorageDriver(t2));
		System.out.println(t1.lessStorageTruck(t2));

	}

}
