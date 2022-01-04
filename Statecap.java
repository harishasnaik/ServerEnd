package Q1;


import java.util.HashMap;
import java.util.Map;

public class Statecap {

	private Map<String, String> state_capital = new HashMap();// Create Object, which is required for you

	public void add_state_capital(String state, String capital) {
		state_capital.put(state, capital);
		System.out.println(state_capital);
	}

	public void viewCapital(String name) {
		if (state_capital.containsKey(name) == true) {
			System.out.println(state_capital.get(name));
		}
	}

	public static void main(String[] args) {
		String s = "karnataka";
		String s1 = "banglore";
		String s0 = "TamilNadu";
		String s11 = "chennai";
		String s01 = "Maharastra";
		String s122 = "pune";
		Statecap s12 = new Statecap();
		s12.add_state_capital(s, s1);
		s12.add_state_capital(s0, s11);
		s12.add_state_capital(s01, s122);
		s12.viewCapital(s01);
	}

}
