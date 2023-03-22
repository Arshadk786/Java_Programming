import java.util.*;
class MyMain
{
    int add(int a, int b)
    {
        int c =a + b;
        return c;
    }
}
class AddMethod
{
    public static void main(String args[])
    {
        int a,b,ans;
        MyMain obj=new MyMain();
        System.out.println("Enter 2 Numbers");
        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        ans=obj.add(a,b);
        System.out.println("The Addition of "+a+" and "+b+" is = "+ans);
    }
}