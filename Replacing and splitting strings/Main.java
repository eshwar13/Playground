import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      String s1 = in.nextLine();
      String s2 = in.nextLine();
      int no_of_parts = in.nextInt();
      String s3 = s1.replace(s1 , s2);
      String flag[] = s3.split(" " ,no_of_parts);
      for(String res : flag )
        System.out.println(res);
    }
}