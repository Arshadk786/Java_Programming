class Demo
{
    private int a=50;
    public void add()
    {
       // a=100; //  this declares a new variable a. 
       this.a=100; // 'this' is used to change the global variable and avoid creating a local variable.
        System.out.println("a= "+a);
    }
}

public class AccessVariable 
{
    public static void main(String[] args) 
    {
        Demo ob=new Demo();
        //ob.a=100; Variable can be changed from main , so in order to avoid it we have to make our variable private
        ob.add();  
    }
    
}
