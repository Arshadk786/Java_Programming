class MyMain
{
    void add(int a)
    {
        System.out.println("Add Method with 1 integer");
    }

    void add(double a)
    {
        System.out.println("Add Method with 1 Float");

    }

    void add(int a, int b)
    {
        System.out.println("Add Method with 2 integer");

    }
    
}

class MethodOverloading
{
    public static void main(String ar[])
    {
        MyMain ob=new MyMain();
        ob.add(5,5);
    }
}
