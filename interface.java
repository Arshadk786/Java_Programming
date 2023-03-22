interface demo  //in interface the methods are already public  and abstract.
{
    void m1();
    void m2();
}
class example implements demo  // interface can't be inherited (extends) , it is implemented (implements).
{
    public void m1()
    {
        System.out.println("In m1 method of example");
    }
    void m2()
    {
        
    }
}
class interface 
{
    public static void main(String ar[])
    {
        demo ob=new demo();
        ob.m1();
    }
}
