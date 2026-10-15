package projectClasses;

public class TestPlayer {

	public static void main(String[] args) {
	
		Player p1 = new Player(2017, "rudiger", "cb", 120000, 22.5);
		Player p2 = new Player(2016, "vini", "lw", 240000, 26.7);

		if(p1.getyear() != p2.getyear())
		{
			p1.joinedFirst(p2);
		}
	}

}
