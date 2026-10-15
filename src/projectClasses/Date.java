package projectClasses;

public class Date {

	private int day, month, year;
	
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public int getday() {
		return day;
	}
	
	public int getmonth() {
		return month;
	}
	
	public int getyear() {
		return year;
	}
	
	public void setDay(int dayToSet) {
		this.day = dayToSet;
	}
	
	public void setMonth(int monthToSet) {
		this.month = monthToSet;
	}
	
	public void setYear(int yearToSet) {
		this.year = yearToSet;
	}
	
	public int compareTo(Date other) {
		if (this.year != other.year)
		{
			return this.year - other.year;
		}
		if (this.month != other.month)
		{
			return this.month - other.month;
		}
		return this.day - other.day;
	}
	
	public String tostring() {
		return "<" + this.day + "><" + this.month + "><" + this.year + ">";
	}
}
