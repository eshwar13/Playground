import java .util.Scanner ;

class Faculty
  {
  
  public void salary(int n)
  {
    System.out.println("Base Salary:" +" "+n);
  }
}
class CSE extends Faculty 
{
  
  public void salary(int n)
  {
  
   int bonus = n + 3000 ;
    System.out.println("CSE Faculty:" +" "+bonus);
  }
}
class IT extends Faculty 
{
  
  public void salary(int n)
  {
   int bonus = n + 5000;
   System.out.println("IT Faculty:" +" "+bonus);
  }
}
class ECE extends Faculty 
{
  public void salary(int n)
  {
  int bonus = n + 4500;
  System.out.println("ECE Faculty:" +" "+bonus);
   
  }
}

class Main
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    Faculty i = new Faculty();
    i.salary(n);
       CSE obj = new CSE();
    obj.salary(n);
    IT ob = new IT();
    ob.salary(n);
    ECE o = new ECE();
    o.salary(n);
  }
}