import java.util.Scanner;
class Main{
    public static void main(String args[]){
      Scanner in  = new Scanner(System.in);
      int arr_size = in.nextInt();
      int arr[] = new int [arr_size] ;
      for(int index = 0 ; index<= arr_size -1 ; index++)
      {
        arr[index] = in.nextInt();
      }
      int search_elem_1 = in.nextInt();
      int search_elem_2 = in.nextInt();
      int elem_idx_1 = -1 ;
      int elem_idx_2 = -1 ;
      for(int index = 0 ; index <= arr_size - 1 ; index++)
      {
        if(search_elem_1 == arr[index])
        {
          elem_idx_1 = index ;
        }
        if(search_elem_2 == arr[index] )
        {
          elem_idx_2 = index ;
        }
      }
      System.out.println(elem_idx_1);
      System.out.println(elem_idx_2);
    }
  

    }
  
