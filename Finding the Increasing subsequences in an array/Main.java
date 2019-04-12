import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int arr_size = in.nextInt();
    int arr[] = new int [arr_size] ;
    for(int index = 0 ; index < arr_size ; index++)
    {
      arr[index] = in.nextInt();
    }
    int sum_arr[] = new int[3 * arr_size] ;
    increasing_sub_array( arr_size , arr, sum_arr );
  }
  public static void increasing_sub_array(int arr_size , int arr[] , int sum_arr[])
  {
    for(int index1 = 0 ; index1 <= arr_size -1 ; index1++)
    {
      int key = arr[index1] ;
      for(int index2 = index1+1 ; index2 <= arr_size -1 ; index2++)
      {
        if(arr[index2] > key)
        {
          System.out.println(key+ "," +arr[index2]+" ");
  }
}
    }
  }
}
