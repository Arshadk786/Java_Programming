interface demo  //in interface the methods are already public  and abstract.
{
    void m1(); // Agar 2 methods declare kiye hai interface me toh jo class me interface ko implement kiya hai usme bhi utne hi method ko declare karna hotta hai.
    void m2();
}
class example implements demo  // interface can't be inherited (extends) , it is implemented (implements).
{
    public void m1() // Since in interface the methods are already public , we have to give same status to method that we have implements from interface.
    {
        System.out.println("In m1 method of example");
    }
    public void m2()
    {

    }
}
public class myinterface 
{
    public static void main(String ar[])
    {
        example ob=new example();
        ob.m1();
    }
}
