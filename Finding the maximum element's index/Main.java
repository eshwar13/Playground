import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int list[] = new int  [n] ;
    int max_index = 0;
    for(int index = 0 ; index < n ; index ++)
    {
      list[index] = in.nextInt();
      }
    
  if(list[0] > list[1] )
  {
      max_index = 0 ; 
  }
    else 
    {
      max_index = 1 ;
    }
    for(int index = 3 ; index <= n -1 ; index ++)
    {
      if(list [max_index] < list[index] )
      {
        max_index = index ;
      }
    }
    System.out.print(max_index);
  }
}


  
