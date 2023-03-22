import java.util.*;
public class Factorial 
{
    public static void main(String ar[])
    {
        int no,fact=1,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        no=sc.nextInt();
        for(i=1;i<=no;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of "+no+" is "+fact);
    }
    
}
