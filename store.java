class swap
{
int a=2; b=3;
void swap1(swap s)
{
int t;
t=s.a;
s.a=s.b;
s.b=t;
System.out.print(s.a+" "+s.b);
public static void main(String args[])
{
swap s2=new swap();
swap s1=new swap();
s1.swap1(s2);
System.out.print(s1.a+" "+s1.b);
}
}