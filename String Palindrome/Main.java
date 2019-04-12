import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       Scanner in = new Scanner(System.in);
      String str = in.nextLine();
      int str_len = str.length();
      int end = str_len -1 ;
      int front = 0;
      boolean is_palindrome = true ;
      while(front < end)
      {
        if(str.charAt(front) != str.charAt(end))
        {
          is_palindrome = false ;
          break ;
        }
        front++;
        end--;
      }
      if(is_palindrome == true )
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
    }
}

  
