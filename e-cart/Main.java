import java.util.Scanner ;

class Item
{
  private int price;
  public void details(int p, int q)
  {
    int total = p * q ;
    System.out.println("Total Price is :" +" "+total);
    
  
}
}


class Main
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    String s = in.nextLine();
    int p = in.nextInt();
    int q = in.nextInt();
    Item i = new Item();
    i.details(p ,q);
    
    
  }
}