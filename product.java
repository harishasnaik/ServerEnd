package Q1;

public class product{

	public static void main(String[] args) {
		Pr[] obj = new Pr[10] ;  
		obj[0] = new Pr(23907,"Dell Laptop",999);  
		obj[1] = new Pr(91240,"HP 630",999);  
		obj[2] = new Pr(29823,"LG OLED TV",999);  
		obj[3] = new Pr(11908,"MI Note Pro Max 9",999);  
		obj[4] = new Pr(43590,"Kingston USB",999); 
		obj[5] = new Pr(23907,"Dell Laptop",999);  
		obj[6] = new Pr(91240,"HP 630",999);  
		obj[7] = new Pr(29823,"LG OLED TV",999);  
		obj[8] = new Pr(11908,"MI Note Pro Max 9",999);  
		obj[9] = new Pr(43590,"Kingston USB",999); 

		System.out.println("Product Object 1:");  
		obj[0].display();  
		System.out.println("Product Object 2:");  
		obj[1].display();  
		System.out.println("Product Object 3:");  
		obj[2].display();  
		System.out.println("Product Object 4:");  
		obj[3].display();  
		System.out.println("Product Object 5:");  
		obj[4].display(); 
		System.out.println("Product Object 1:");  
		obj[5].display();  
		System.out.println("Product Object 2:");  
		obj[6].display();  
		System.out.println("Product Object 3:");  
		obj[7].display();  
		System.out.println("Product Object 4:");  
		obj[8].display();  
		System.out.println("Product Object 5:");  
		obj[9].display();
}
}

class Pr 
{  
int pro_Id; 
int price;
String pro_name;  
//Product class constructor  
Pr(int pid, String n,int val)  
{  
pro_Id = pid;  
pro_name = n; 
price = val;
}  
public void display()  
{  
System.out.print("Product Id = "+pro_Id + "  " + " Product Name = "+pro_name +" Product Name= "  +pro_name);  
System.out.println();  
}  
}

