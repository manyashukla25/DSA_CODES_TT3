public class SalaryTT {

        //class variables
        private int id;
        private String name;
        private double salary;
        private double hra;
        private double da;
        private double ta;
        private double ma;
        private double pf;
        private double gross_sal;
        private double annual_tax;
       
        public void allowances(double salary)
        {
        hra=0.5*(salary);
        da=0.15*(salary);
        ta=0.2*(salary);
        ma=0.2*(salary);
        pf=0.1*(salary);
        }
        public void gross_sal(double salary)
        {
        gross_sal=salary+hra+da+ta+ma;
        }
        public void taxs(float salary)
        {
        if((gross_sal*12)>900000)
        annual_tax=0.3*salary;
       
        else if((gross_sal*12)>700000)
        annual_tax=0.2*salary;
       
        else if((gross_sal*12)>500000)
        annual_tax=0.1*salary;
        }
        public void input(int id,String name,int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
        allowances(salary);
        gross_sal(salary);
        taxs(salary);
        }
       
        public void display()
        {
       
        System.out.println("Name of the Employee: "+ this.name);
        System.out.println("Basic Salary(BS): "+ this.salary);
        System.out.println("House Rent Allowance(HRA): "+ this.hra);
        System.out.println("Dearness Allowance(DA): "+ this.da);
        System.out.println("Travelling Allowance(TA): "+ this.ta);
        System.out.println("Medical Allowance(MA): "+ this.ma);
        System.out.println("Provident Fund(PF): "+ this.pf);
        System.out.println("Gross Salary(GS)"+ this.gross_sal);
        System.out.println("Payable Tax: "+ this.annual_tax);
        System.out.println();
        System.out.println("-----------------------------");
        }
       
        public static void main(String[] args) {
            System.out.println("Name: LAVANYA");
            System.out.println("SAPID: 1000014237\n");
        SalaryTT e1=new SalaryTT();
        SalaryTT e2=new SalaryTT();
        e1.input(1001,"Amit Srivastava",10000);
        e2.input(1003,"Lavanya",30000);
        e1.display();
        e2.display();
        }
       }
       