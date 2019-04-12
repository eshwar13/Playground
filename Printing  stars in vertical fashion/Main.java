import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int star ;
    for( star = 1; star <= n; star++)
    {
      System.out.println("*");
    }
  }
}