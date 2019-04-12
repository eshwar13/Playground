import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner (System.in);
    int n = in.nextInt();
    int first = n/ 100;
    int second = n/ 10 % 10;
    int last = n % 10;
    int reverse = last * 100 + second * 10 + first ;
    System.out.println(reverse);
  }
}