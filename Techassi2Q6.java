public class Techassi2Q6 {
    static void arms(int n, int sum, int res)
    {
        if(n==0)
        {
            System.out.println(sum);
            return;
        }
        int k=n%10;
        sum=sum+(k*k*k);
        arms(n/10, sum, res);
    }
    
    static int arms(int n,int a)
	{
	if(n!=0)
	{
		int x=n%10;
		a=a+(x*x*x);
		n/=10 ;
		return arms(n,a);
	}
	return a;
	}

    public static void main(String[] args) {
        int arms;
        System.out.println("Method 1 :");
        for(int i=0;i<10;i++)
        {
            arms(i, 0, 0);
        }
        System.out.println("Method 1 Ends");
        for (int i = 1; i < 10; i++) {
            arms=arms(i, 0);
            if(arms==i)
            System.out.println(i);
        }
        System.err.println("End Method 2");
    }

}
