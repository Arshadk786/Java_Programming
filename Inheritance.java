import java.util.*;
class Parent
{
    void Method1()
    {
        System.out.println("This is in method 1 of parent");
    }
}
class child extends Parent
{
  
}


class Inheritance
{
    public static void main(String ar[])
    {
        child ob=new child();
        ob.Method1();
    } 
}