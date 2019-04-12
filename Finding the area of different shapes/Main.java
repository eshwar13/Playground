import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
       Scanner in = new Scanner(System.in);
      int option = in.nextInt();
      switch(option)
      {
        case 1 :
          int side = in.nextInt();
          int a = side * side ;
          System.out.println(a );
          break; 
        case 2 :
          int l = in.nextInt();
          int b = in.nextInt();
          int a1 = l * b ;
          System.out.println(a1);
          break ;
        case 3 :
          int base = in.nextInt();
          int height = in.nextInt();
          int a3 = base * height / 2 ;
          System.out.println(a3);
          break ;
        case 4 : 
          int radius = in.nextInt();
          double a4 = 3.14 * radius * radius ;
          System.out.println(a4 );
            break ;
      }
    }
}

    