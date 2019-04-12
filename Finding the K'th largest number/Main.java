import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      int arr_size = in.nextInt();
      int arr[] = new int[arr_size] ;
      for(int index= 0 ; index < arr_size ; index++)
      {
        arr[index] = in.nextInt();
      }
      int k = in.nextInt();
      for(int index1 = 0 ; index1 < arr_size ; index1++)
      {
        for(int index2 = index1+1 ; index2 < arr_size  ; index2++)
        {
          if(arr[index1] < arr[index2] )
          {
            int temp = arr[index1] ;
            arr[index1] = arr[index2] ;
            arr[index2] = temp ;
          }
        }
        if(index1 == k -1 )
        {
          System.out.println(arr[index1]);
        }
      }
    }
}

