package Q1;

public class Testplayer {

	public static void main(String[] args) {
		Player p1 = new Player("karthik", "k@gmail.com", "banglore", "karnataka", 10);
		Player p2 = new Player("sham", "sham@gmail.com", "banglore", "karnataka", 15);
		Player p3 = new Player("harisha", "ha@gmail.com", "banglore", "karnataka", 13);
		Player p4 = new Player("nikkil", "nik@gmail.com", "banglore", "karnataka", 19);
		
		Sports s1Club = new Sports();
		s1Club.addCricketPlayers(p4);
		s1Club.addCricketPlayers(p3);
		s1Club.addFootballPlayers(p1);
		s1Club.addFootballPlayers(p2);
		s1Club.addCricketPlayers(p1);
		s1Club.addFootballPlayers(p4);
		
		s1Club.checkplayers();
		s1Club.viewPlayers();
	}

}
