import java.util.Scanner;
public class SumOfSeries {
  public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  System.out.println("Name: LAVANYA");
  System.out.println("SAPID: 1000014237\n");
  System.out.print("Enter Value of n: ");
  int n = scan.nextInt();
  double i, s = 0.0;
  for (i = 1; i <= n; i++)
  {
 s = s + 1 / i;
  }
 System.out.printf("Sum is %f", s);
   }
 }