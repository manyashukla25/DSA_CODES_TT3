class swap
{
void swap1(int a, int b)
{
int t;
t=a;
a=b;
b=t;
System.out.print(a+" "+b);
}
public static void main(String[] args)
{
int a=2;b=3;
swap s1=new swap();
s1.swap1(a,b);
System.out.print(a+" "+b);
}
}
