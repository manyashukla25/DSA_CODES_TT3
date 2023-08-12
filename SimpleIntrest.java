import java.util.Scanner;
public class SimpleIntrest {
   
    public static void main(String args[]) 
    {
        float p, r, t;
        Scanner s = new Scanner(System.in);
        System.out.println("Name: LAVANYA");
        System.out.println("SAPID: 1000014237");
        System.out.print("Enter the Principal : ");
        p = s.nextFloat();
        System.out.print("Enter the Rate of interest : ");
        r = s.nextFloat();
        System.out.print("Enter the Time period : ");
        t = s.nextFloat();
        float simpleintrest;
        simpleintrest = (r * t * p) / 100;
        System.out.print("The Simple Interest is : " + simpleintrest);
    }
}


