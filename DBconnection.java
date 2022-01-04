package Q1;

public class DBconnection {

	private  static DBconnection obj=null;
	
	private DBconnection() {
		
		
	}
	public static DBconnection getObject()
	{
		if(obj==null)
		{
			obj=new DBconnection();
			System.out.println("Object created");
		}
		else
		{
			System.out.println("Object Not created");
			throw new IllegalArgumentException("Object alredy created");
		}
		return obj;
	}
	public static void main(String args[])
	{
		DBconnection.getObject();
		DBconnection.getObject();

		
		
	}
	
}
