public class Main {
	public static void main(String[] args) 
    {
     Customers ob = new Customers();
      ob.n();
      Suppliers obj = new Suppliers();
      obj.s();
		
    }	
}

class Users {
	public void m()
    {
      System.out.println("Saakshi, 9000000000");
      System.out.println("Rahul, 9000000001");
      System.out.println("ABC Traders, 8000000000");
      System.out.println("XYZ Enterprises, 8000000900");
}
}

class Customers extends Users
{
public void n()
{
 super.m();
System.out.println("Saakshi, Bangalore");
System.out.println("Saakshi, Coimbatore");
System.out.println("ABC Traders, Mumbai");
System.out.println("ABC Traders, Delhi");
System.out.println("Order placed successfully!");
}
		 	
}

class Suppliers extends Users 
{
		public void s()
        {
        
        
        
        System.out.println("ABC Traders, 15");
        System.out.println("XYZ Enterprises, 17");
        }
}