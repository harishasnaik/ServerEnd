package Q1;

interface Currency {

	public abstract void getCurrency();
}
class India implements Currency {

	@Override
	public void getCurrency() {
		
    System.out.println("India currency is Rs");
	}

}
class UK implements Currency {

	@Override
	public void getCurrency() {
		// TODO Auto-generated method stub
   System.out.println("UK currency is Pound");
	}

}

class USA implements Currency {

	@Override
	public void getCurrency() {
		// TODO Auto-generated method stub
		System.out.println("USA currency is Doller");
	}

}
public class Currencys {

	public static void main(String[] args) {
		India obj1 = new India();
		UK obj2=new UK();
		USA obj3 = new USA();

	}

}
