import java.util.*;
class Condition
{
    public static void main(String ar[])
    {
        int no;
        System.out.println("Enter Your Age");
        Scanner age= new Scanner(System.in);
        no=age.nextInt();
        if(no>17)
        {
            System.out.println("You are Eligible to vote");
        }
        else
        {
            System.out.println("You are not Eligible to vote");
        }
    }
    
}
