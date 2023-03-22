import java.util.Scanner;
package hero;
class demo
{
    int x;
    String name;
    void showData()
    {
        System.out.println("int :"+ x +  "\nString :"+ name);
    }
    public static void main(String[] args) 
    {
        demo ob = new demo();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a integer");
        ob.x=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter a String");
        ob.name=sc.nextLine();
        ob.showData();

    }
}