import java.util.*;
public class FactorialUsingMethods 
{
    int Fact(int no)
    {
        int fact=1,i;
        for(i=1;i<=no;i++)
        {
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String arg[])
    {
        int fact,no;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A Number");
        no=sc.nextInt();
        FactorialUsingMethods obj=new FactorialUsingMethods();
        fact=obj.Fact(no);
        System.out.println("The factorial of "+no+" is "+fact);


    }
    
}
