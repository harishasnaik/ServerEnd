package Q1;

public class item {

	
	String id;
	String name;
	float price;
	
	public item(String id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public void swap(item desktop) {
		float pri = desktop.price;
		desktop.price = this.price;
		this.price = pri;
	}

	public static void main(String[] args) {
		item laptop = new item("1", "DELL", 10000);
		item desktop = new item("2", "lg", 20000);
		System.out.println("laptop  "+laptop.price);
		System.out.println("desktop  "+desktop.price);
		
		laptop.swap(desktop);
		
		System.out.println("laptop  "+laptop.price);
		System.out.println("desktop  "+desktop.price);
	}
	
	
}
