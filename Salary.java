import java.util.Scanner;
public class Salary {
    public static void main(String args[]) 
    { 
        double hra,ta,ma,pf,gs,tax,ns;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name: LAVANYA");
        System.out.println("SAPID: 1000014237\n");
        System.out.println("Enter the Id");
        int id = scanner.nextInt(); 

        System.out.println("Enter your Name");
        scanner.nextLine();
        String name = scanner.nextLine();
        
        System.out.println("Enter the basic salary");
        double bs = scanner.nextDouble();
        
        
        hra = 0.5*bs;
        ta= 0.3*bs;
        ma = 0.25*bs;
        pf= 0.1*bs; 
        gs=bs+hra+ta+ma;
        tax = 0.1*gs;
        ns = gs-tax-pf;

        System.out.println("Id is "+id);
        System.out.println("Name is "+name);
        System.out.println("Your basic salary is "+bs);
        System.out.println("Earnings\n\n");
        
        System.out.println("Basic Salary                "+bs);
        
        System.out.println("House Rent Allowances       "+hra);
        
        System.out.println("TA                          "+ta);
        
        System.out.println("Medical Allowances          "+ma);
        
        System.out.println("PF                          "+pf);
      
        System.out.println("Gross Salary                "+gs);
        
        System.out.println("\nDeductions\n");
        
        System.out.println("Tax                         "+tax);
        System.out.println("Net Salary                  "+ns);
    
        
        scanner.close();
    }

    public void takeInput(String string, int i) {
    }

    public void calculate() {
    }

    public void print() {
    }
}
