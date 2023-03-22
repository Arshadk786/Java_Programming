/*
There are 4 access specifiers for variables and methods
1. Private : It is only accessible within the class
2. Protected
3. Default : all methods and variables are already at default
4. Public : it can be accessible from anywhere
*/
class Demo
{
    private void m1()
    {
        System.out.println("in M1 method of Demo");
    }

    public void m2()
    {
        System.out.println("In m2 method of Demo");
        m1();
    }

}

class Access 
{
    public static void main(String[] args) 
    {
        Demo ob=new Demo();
        ob.m2();
    }
}
