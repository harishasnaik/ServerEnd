package Q1;

interface MyIterator  {
	
	 boolean hasNext();
	 String next();
}

class UserList  implements MyIterator  {

	private String name[] = new String[10];
	private int index;

	public UserList() {
		System.out.println("User list");
		index = 0;
		name[0] = "a";
		name[1] = "b";
		name[2] = "c";
		name[3] = "d";
		name[4] = "e";
		name[5] = "f";
		name[6] = "g";
		name[7] = "h";
		name[8] = "i";
		name[9] = "k";
		
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(index < name.length) {
		return true;
		}
		else {
			index = 0 ;
			return false;
		}
	}

	@Override
	public String next() {
		if(hasNext()) {
			return name[index++]+"\n"+next();
		}
		else {
			return "userlist ends";
		}
	}
	
	public static MyIterator getIterator() {
		return new UserList();
	}

}

class UserClient {

	public static void main(String[] args) {
		System.out.println(UserList.getIterator().next());
	}
}

public class MyIterators {

	public static void main(String[] args) {
		UserClient obj1 = new UserClient();
		UserList obj2 = new UserList();

	}

}
