package Q1;

interface  Instrument {

	public abstract void play();
}

class Piano implements Instrument {

	@Override
	public void play() {
	  System.out.println("Piano is playing pee peee peee ");
		
	}

}

class Flute implements Instrument {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Flute is playing toot toot toot toot");
	}

	
}

class Guitar implements Instrument {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Guitar is playing tin tin tin tin");
	}

}

public class Intruments {

	public static void main(String[] args) {
		Guitar obj1=new Guitar();
		Flute obj2 =new Flute();
		Piano obj3 = new Piano();

	}

}
