import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      int base = in.nextInt();
      int exp = in.nextInt();
      int count = 0 ;
      int res = 1 ;
      while(count < exp )
      {
        res = res * base ;
        count++ ;
      }
      System.out.println(res);
      
    }
}