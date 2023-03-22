import java.sql.DriverManager;

/*class demo 
{
    int x;
    demo()
    {
       
    }
    public static void main(String[] args) {
        demo ob= new demo();
        System.out.println("Data:"+ ob.x);
    }
}

import java.util.Scanner;
class Cab
{
    private int fare;

    public int getFare()
    {
        return fare;
    }

    public void setFare(int a)
    {
        fare=a;
    }

    public Cab()
    {
        fare=30;
    }
    public Cab(int f)
    {
        this.fare=f;
    }
}
class Ridecab
{
    public static void main(String[] args) 
    {
        int d,base,dcu;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Distance From User: ");
        dcu=sc.nextInt();
        if(dcu>5)
        {
            Cab ob = new Cab(30 + 10 * (dcu - 5));
            System.out.print("Enter Distance Travelled: ");
            d=sc.nextInt();
            base=ob.getFare();
            ob.setFare(base + 10 * d);
            System.out.println("Total Fare:" +ob.getFare());

        }
        else{
            Cab ob = new Cab();
            System.out.print("Enter Distance Travelled: ");
            d=sc.nextInt();
            base=ob.getFare();
            ob.setFare(base + 10 * d);
            System.out.println("Total Fare:" +ob.getFare());
        }
        
    }
}
*/
import java.sql.*;
class JDBC
{
    public static void main(String[] args) {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/essentials", "root", "@rshadK786");
            Statement st = con.createStatement();
            st.executeQuery("select * from student;");
            ResultSet rs= st.executeQuery("select * from student;");
            while(rs.next())
            {
                System.out.println("roll: "+rs.getInt(1));
                System.out.println("name: "+rs.getString(2));
                System.out.println("Marks: "+rs.getInt(3));
            }
        }
        catch (Exception e) 
        {
           System.out.println(e);
        }
      
    }
}