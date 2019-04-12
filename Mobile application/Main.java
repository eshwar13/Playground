class MyModel1 
{
    public void first()
    {
      System.out.println("Features of MyModel 1");
      System.out.println("Camera mega pixels: 2");
    }
}
class MyModel2 extends MyModel1 
{
     public void second()
     {
     super.first();
     System.out.println("Features of MyModel 2" );
     System.out.println("Camera mega pixels: 5");
     System.out.println("Lock mechanism: Fingerprint");
     System.out.println("Display size: 5");
     }
     
}
class MyModel2T extends MyModel2 
{
     public void third()
     {
     super.second();
     System.out.println("Features of MyModel 2T");
     System.out.println("Camera mega pixels: 16");
     System.out.println("Lock mechanism: Fingerprint");
     System.out.println("Display size: 6");
     }
     }
     

public class Main 
{
    public static void main(String[] args) 
    {
          MyModel2T obj = new MyModel2T();
      obj.third();
    }
}