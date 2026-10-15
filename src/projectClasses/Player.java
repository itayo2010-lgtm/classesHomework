package projectClasses;

public class Player {

	private String name, role;
	private int year;
	private double salary, age;
	
	public Player(int year, String name, String role, double salary, double age) {
		this.year = year;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.role = role;
	}
	
	public double getage() {
		return this.age;
	}
	
	public double getsalary() {
		return this.salary;
	}
	
	public int getyear() {
		return this.year;
	}
	
	public String getname() {
		return this.name;
	}
	
	public String getrole() {
		return this.role;
	}
	
	
	public void setage(double age2) {
		this.age = age2;
	}
	
	public void setsalary(double salary2) {
		this.salary = salary2;
	}
	
	public void setyear(int year2) {
		this.year = year2;
	}
	
	public void setname(String name2) {
		this.name = name2;
	}
	
	public void setrole(String role2) {
		this.role = role2;
	}
	
	
	public String tostring() {
		return this.name + " " + this.age + " " + this.role + " " + this.year + " " + this.salary;
	}
	
	
	public String joinedFirst(Player other) {
		if(this.year != other.year)
		{
			if(this.year < other.year)
			{
				return this.name;
			}
			return other.name;
		}
		return "equals";
	}
	
}




