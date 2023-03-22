class Demo
{
    Demo()
    {
        System.out.println("I am in Demo method");
    }

    Demo(int a)
    {
        System.out.println("Given integer value is "+a);
    }

    void m1()
    {
        System.out.println("I am in m1 method of Demo");
    }
}

class parameterConstrutor
{
    public static void main(String args[])
    {
        Demo ob=new Demo();
        Demo ob1=new Demo(6);

    }   
}
