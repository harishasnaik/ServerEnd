package Q1;

public class Arraycheck {

	public static void main(String[] args) {
		int[] Array = new int[] {4,0,2,4,3,1,3,4,5,6,7,8,9};
		Arraycheck s1= new Arraycheck();
		s1.check(Array);

	}
public void check(int[] arr) {
	int sun=0;
	for(int i=0;i<=arr.length-3;i++) {
		int take = arr[i]+arr[i+1]+arr[i+2];
		if(take%3==0) {
			sun++;
		}
	}
	System.out.println(sun);
}
}
