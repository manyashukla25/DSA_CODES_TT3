import java.util.Scanner;
public class SumOfDigitsDivisibleTT {
   public static void main(String[] args){
    System.out.println("Name:LAVANYA");
System.out.println("SAP ID:1000014237\n");
System.out.print("Enter the number : ");

    Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
    int store = n;
        int s = 0;

        while(store != 0 )
        {
            int b = store % 10;
            s = s + b;
            store = store/10;
        }
        System.out.println(s);
        if(n % s == 0)
        {
            System.out.print(n+" - Yes");
        }
        else{
            System.out.print(n+" - No");
        }
    }
}


