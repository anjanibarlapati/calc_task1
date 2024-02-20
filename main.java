import java.util.*;
class main
{   
    public static void addition(int a,int b)
{
    System.out.println("Sum is: "+(a+b));
}
{ 
    public static void subtraction(int a,int b)
    {
        System.out.println("Diff is: "+(a-b));
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        addition(a,b);
        subtraction(a,b);
    }
}