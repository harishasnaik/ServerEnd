package Q1;

import javax.naming.LinkException;
import javax.security.auth.login.AccountException;

public class BankAccount {

	int accNo;
	String customername,acctype;
	float balance;
	public BankAccount(int accNo, String customername, String acctype, float balance) throws Exception {
		super();
		this.accNo = accNo;
		this.customername = customername;
		this.acctype = acctype;
		
		if(acctype.equals("Current"))
		{
			if(balance>1000 && balance>0)
			{
				this.balance = balance;
				System.out.println("Yes");
			}
			else if(balance>=1 && balance<1000)
			{
				
					throw new Exception();
				
			}
			else if(balance<0)
			{
				
				throw new Exception();
				
			}
		}
		else if(acctype.equals("Saving"))
		{
//			if(balance>5000 && balance>0)
//			{
//				this.balance = balance;
//				System.out.println("Yess");
//			}
//			else if(balance>=1 && balance<1000)
//			{
//				
//					throw new LowBalanceException();
//				
//			}
//			else if(balance<0)
//			{
//				
//				throw new NegativeAmountException();
//				
//			}
			
			if(balance<0)
				{
					
					throw new Exception();
					
				}
			else if(balance<5000 && balance>=1)
			{
				throw new Exception();
			}
			else
			{
				this.balance=balance;
			}
		}
		else
		{
			System.out.println("Ac Not their");
		}

		
	}
	public void deposit(float amt) throws Exception
	{
	     if(amt<0)
		{
			throw new Exception();
		}
	     else
	     {
	    	 balance=balance+amt;
	     }
		
	}
	
	public void withdraw(float amt) throws Exception {
		
		if(acctype.equals("Saving"))
		{
	    if (balance-amt<5000 && balance>=1)
		{
			
				throw new Exception();
			
		}
		else if(amt<0)
		{
			
			throw new Exception();
			
		}
		else
		{
			 balance=balance-amt;
		}
		}
	    else 
		{
		    if (balance-amt<1000 && balance>=1)
			{
				
					throw new Exception();
				
			}
			else if(amt<0)
			{
				
				throw new Exception();
				
			}
			else
			{
				 balance=balance-amt;
			}
		    
	}
	}
	
	public float getBalance() {
		return balance;
	}
	
	
	public static void main(String[] args) throws Exception
	{
		try {
			BankAccount ba=new BankAccount(1001,"Raju","Current",1775);
			//BankAccount ba=new BankAccount(1001,"Rage","Saving",8875);
			ba.deposit(1110);
			System.out.println(ba.getBalance());
			ba.withdraw(9000);
			System.out.println(ba.getBalance());
			
		} catch (AccountException | LinkException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
}
