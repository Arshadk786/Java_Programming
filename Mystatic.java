class Demo
{
    void m1()
    {
        System.out.println("In m1 method which is Non static");
    }

    static void m2()
    {
        System.out.println("In m2 method which is static");
    }
}


public class Mystatic 
{
    public static void main(String[] args) 
    {
        Demo.m2();  //we can call static method by their class name(Demo) followed by method (m2())
    }
    
}
