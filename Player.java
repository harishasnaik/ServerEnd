package Q1;


public class Player {
	String name, email, city, state;
	int age;

	public Player(String name, String email, String city, String state, int age) {
		super();
		this.name = name;
		this.email = email;
		this.city = city;
		this.state = state;
		this.age = age;
	}
	

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", email=" + email + ", city=" + city + ", state=" + state + ", age=" + age
				+ "]";
	}

}
