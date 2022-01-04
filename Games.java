package Q1;

interface Game {

	public abstract void start();
	public abstract void play();
	public abstract void stop();
}

class Car implements Game {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Car Start Method called");

	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Car play Method called");

	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Car Stop Method called");

	}

}

class Bike implements Game {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Bike Start Method called");

	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Bike play Method called");

	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Bike Stop Method called");

	}

}

class Bicycle implements Game {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Bicycle Start Method called");

	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Bicycle play Method called");

	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Bicycle Stop Method called");

	}

}

public class Games {

	public static void main(String[] args) {
		Car obj1 = new Car();
		Bike obj2 = new Bike();
		Bicycle obj3=new Bicycle();
		
		obj1.play();

	}

}
