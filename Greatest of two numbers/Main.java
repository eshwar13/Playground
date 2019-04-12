import java.util.Scanner;
class Main {
	public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
      // get the inputs from the user 
      int num1 = sc.nextInt();
      int num2 = sc.nextInt();
      // compare the two elements 
      if(num1 > num2 )
      {
        System.out.println("num1 is the greatest number");
      }
      else
      {
        System.out.println("num2 is the greatest number");
      }
                            
	}
}