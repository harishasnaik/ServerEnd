package Q1;

public class Member implements Comparable<String> {
	 String mid, name, city, country;
	 
	 public Member(String mid, String name, String city, String country) {
			super();
			this.mid = mid;
			this.name = name;
			this.city = city;
			this.country = country;
		}
		
		public String getMid() {
			return mid;
		}
		
		public String getName() {
			return name;
		}

		public void display()
		{
			System.out.println("Member : "+mid+" name :"+name+" city : "+city+" country : "+country);
		}

		@Override
		public int compareTo(String arg0) {
			return this.getName().compareTo(arg0);
		}

		@Override
		public String toString() {
			return "Member [mid=" + mid + ", name=" + name + ", city=" + city + ", country=" + country + "]";
		}
}
