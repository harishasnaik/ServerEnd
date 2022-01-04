package Q1;

public class gcd {

	static int c1=0,c2=1,c3=0;
	public void findGcd()
	{
	 int n1 = 366, n2 = 60;
    int hcf = hcf(n1, n2);

    System.out.printf("G.C.D of %d and %d is %d.", n1, n2, hcf);
    System.out.println();
	}


public static int hcf(int n1, int n2)
{
    if (n2 != 0)
        return hcf(n2, n1 % n2);
    else
        return n1;
}
	
	public void finocciseries(int count)
	{
	  
	 if(count>0)
	 {    
	  c3=c1+c2;    
	  System.out.println(" "+c3);    
	  c1=c2;    
	  c2=c3;  
	  finocciseries(count-1);
	 }    
	}
	
	public int SumOfNaturalNumber(int num)  
	{ 
	if (num<=1)
	{
		return num;
	}
	else
	{
	System.out.println(num);
	return (num+SumOfNaturalNumber(num-1));
	
	}
	
	}  
	
	public static void main(String[] args) {
		

		gcd gcd=new gcd();
		gcd.findGcd();
		int count=10; 
		System.out.println(" "+c1+"\n "+c2);
		gcd.finocciseries(count-2);
		
		int num=5;
		int sum=gcd.SumOfNaturalNumber(num);
		System.out.println("Sum of First 3 Natural Numbers is = " + sum);  
		
	}

}