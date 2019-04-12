import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
       Scanner in = new Scanner(System.in);
      int arr_size = in.nextInt();
      int arr[] = new int [arr_size] ;
      for(int index = 0 ; index <= arr_size  -1 ; index ++)
      {
        arr[index] = in.nextInt();
      }
      int left = 0 ;
      int right = arr_size -1 ;
      boolean is_palindrome = true ;
      while (left <= right)
      {
        if(arr[left] != arr[right] )
        {
          is_palindrome = false ;
          break ;
        }
        left ++ ;
        right -- ;
      }
      if(is_palindrome == true )
      {
        System.out.print("Yes");
      }
      else 
      {
        System.out.print("No");
      }
    }
}

    
