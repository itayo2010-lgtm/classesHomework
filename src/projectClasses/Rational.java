package projectClasses;

public class Rational {

	private int x,y;
	
	public Rational(int x,int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getN() {
		return this.x;
	}
	
	public int getD() {
		return this.y;
	}
	
	
	public boolean isEqual(Rational other) {
		return this.x * other.y == this.y * other.x;
	}
	
	public double multiply(Rational other) {
		return (double)(this.x * other.x)/(this.y * other.y);
	}
	
	public double divide(Rational other) {
		if (other.x != 0) {
			return (double)(this.x * other.y)/(this.y * other.x);
		}
		return 0;
	}
	
	public double plus(Rational other) {
		return (double)((this.x * other.y) + (other.x * this.y)) / (this.y * other.y);
	}
	
	public double minus(Rational other) {
		return (double)((this.x * other.y) - (other.x * this.y)) / (this.y * other.y);
	}

	public String tostring() {
		return "<" + this.x + ">/<" + this.y + ">";
	}
	
}



