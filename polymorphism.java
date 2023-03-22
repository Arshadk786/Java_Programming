class parent
{
    void m1()
    {
        System.out.println("In m1 method of parent");
    }

    void m2()
    {
        System.out.println("In m2 method of parent");
    }
}
class child extends parent
{
    void m1()
    {
        System.out.println("In m1 method of child");
    }

    void m3()
    {
        System.out.println("In m3 method of child");
    }
}


public class polymorphism 
{
   public static void main(String[] args) 
   {
       parent ob=new parent(); //this is possible because child has inherited parent.
       ob.m1();               //this is called dynamic polymorphism
       ob=new child();
       ob.m1();               //this is called dynamic polymorphism
       
   }
    
}
