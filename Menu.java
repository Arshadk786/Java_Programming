import java.util.*;
class Menu
{
    public static void main(String[] args) 
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter to Numbers");
        
        a=sc.nextInt();
        b=sc.nextInt();

        System.out.println("*****MENU*****");
        System.out.println("\n1. Addition");
        System.out.println("\n2. Subtraction");
        System.out.println("\n3. Multiplication");
        System.out.println("\n4. Division\n");

        c=sc.nextInt();
        
        switch(c)
        {
            case 1:
            c=a+b;
            System.out.println("Addition of "+a+" and "+b+" is = "+c);
            break;

            case 2:
            c=a-b;
            System.out.println("Subtraction of "+a+" and "+b+" is = "+c);
            break;

            case 3:
            c=a*b;
            System.out.println("Multiplication of "+a+" and "+b+" is = "+c);
            break;

            case 4:
            c=a/b;
            System.out.println("Division of "+a+" and "+b+" is = "+c);
            break;

            default:
            System.out.println("You have chosen the wrong option");
            break;
        }
    }
}