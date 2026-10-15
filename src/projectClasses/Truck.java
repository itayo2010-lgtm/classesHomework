package projectClasses;

public class Truck {

	private int numstorage;
	private String drivername, truckid;
	
	public Truck(int numstorage, String drivername, String truckid) {
		this.numstorage = numstorage;
		this.drivername = drivername;
		this.truckid = truckid;
	}
	
	public int getnumstorage() {
		return this.numstorage;
	}
	
	public String getdrivername() {
		return this.drivername;
	}
	
	public String gettruckid() {
		return this.truckid;
	}
	
	public void setnumstorage(int num) {
		this.numstorage = num;
	}
	
	public void setdrivername(String name) {
		this.drivername = name;
	}
	
	public void settruckid(String id) {
		this.truckid = id;
	}
	
	public String tostring() {
		return this.drivername + " " + this.truckid + " " + this.numstorage;
	}
	
	
	public String moreStorageDriver(Truck other) {
		if (this.numstorage > other.numstorage) {
			return this.drivername;
		}
		return other.drivername;
	}
	
	public String lessStorageTruck(Truck other) {
		if (this.numstorage < other.numstorage) {
			return this.truckid;
		}
		return other.truckid;
	}	
}
