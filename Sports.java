package Q1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.print.attribute.HashAttributeSet;

public class Sports {
	List<Player> football = new ArrayList();
	List<Player> cricket = new ArrayList();
	List<String> allplayer = new ArrayList();
	Set<Player> s = new HashSet();

	void addCricketPlayers(Player p) {
		football.add(p);

	}

	void addFootballPlayers(Player p) {
		cricket.add(p);
	}

	void checkplayers() {
		List<String> allplayer1 = new ArrayList();
		allplayer1 = addBothPlayers(football, cricket);
		System.out.println("Players in both games " + allplayer1);
	}

	List<String> addBothPlayers(List<Player> football, List<Player> cricket) {

		for (Player p1 : football) {
			s.add(p1);
		}
		for (Player p1 : cricket) {
			if (!s.add(p1)) {
				allplayer.add(p1.getName());
			}
		}
		Collections.sort(allplayer);
		return allplayer;
	}

	void viewPlayers() {
		System.out.println(s);
	}

}
