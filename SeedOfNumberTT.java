import java.util.Scanner;
public class SeedOfNumberTT {
    public static void main(String[] args){
        System.out.println("Name:LAVANYA");
    System.out.println("SAP ID:1000014237\n");
    System.out.print("Enter the number : ");
    Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   int ab = n;
        int seed = 1;
        seed = seed*n;
        while( n != 0)
        {
            int b = n%10;
            seed  = seed * b;
            n = n/10;
        }
        System.out.println(seed+ " is seed of "+ab);
    }
}


