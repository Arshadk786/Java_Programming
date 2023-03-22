abstract class demo
{
    abstract void m1();
    void m2()
    {
        System.out.println("In m2 method of demo");
    }
}
class demo1 extends demo
{

    void m1()
    {
        System.out.println("In m1 method of demo1");
    }
}
public class Abstract 
{
    public static void main(String[] args)
    {
        demo1 ob=new demo1();
        ob.m1();
        ob.m2();
        
    }
    
}
