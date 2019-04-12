import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     Scanner in = new Scanner (System.in);
      int n = in.nextInt();
      int sum = 0;
      // Run for loop until count reaches n 
      for(int count = 1; count<= n;count = count+1)
      {
        //adding count with sum 
        sum = sum +count ;
      }
      System.out.println(sum);
	}
}