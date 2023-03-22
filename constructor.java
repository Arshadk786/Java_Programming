class Demo
{
    Demo()
    {
        System.out.println("I am in Demo method");
    }
    void m1()
    {
        System.out.println("I am in m1 method of Demo");
    }
}

class constructor
{
    public static void main(String args[])
    {
        Demo ob=new Demo();
    }   
}
