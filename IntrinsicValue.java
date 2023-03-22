import java.util.*;
class values
{
    static double Dividend(double DA , double CSP) //DA = Dividend Amount & CSP= Current Share Price
    {
        double DividendYield;
        DividendYield= (DA/CSP)*100;
        System.out.println("Dividend Yield = "+DividendYield+" %\n\n\n");
        return 0;
    }

    static double DividendAmount(double CSP,double DY){ //DY = Dividend Yield
        double DA;
        DA= (DY/100)*CSP;
        System.out.println("Dividend Amount = "+DA+"Rs\n\n\n");
        return 0;
    }
    
    static double Returns(double PP, double SP){
        double profit =((SP/PP)-1)*100;
        System.out.println("Your Returns = "+profit+" %\n\n\n");
        return 0;
    }
    
    static double CompoundAnnualGrowthRate(double PP, double SP , double NY){ //NY = No of Years
        double math = Math.pow((SP/PP),(1/NY));
        double CAGR = (math-1)*100;
        System.out.println("Your CAGR = "+CAGR+" %\n\n\n");
        return 0;
    }
    
    static double DividendPayoutPercentage(int FV, double DA){  //DPP= Dividend Payout Percentage
        double DPP;
        DPP=(DA/FV)*100;
        System.out.println("Dividend Payout Percentage = "+DPP+" %\n\n\n");
        return 0;
    }
    
    static double dividendReturn(double DA, double CSP){ //DA = Dividend Amount and CSP = Current Share Price 
        double DR;
        DR = (DA/CSP)*100;
        System.out.println("Returns From Dividend = "+DR+" %\n\n\n");
        return 0;
    }
}
public class IntrinsicValue
{
    public static void main(String[] args) {
        int no;
        Scanner sc=new Scanner(System.in);
        do{
        System.out.println("==============MENU==============");
        System.out.println("1. Calculate Dividend Yield");
        System.out.println("2. Calculate Dividend Amount ");
        System.out.println("3. Calculate Returns ");
        System.out.println("4. Calculate CAGR ");
        System.out.println("5. Calculate Dividend Payout Percentage (%) ");
        System.out.println("6. Calculate Returns From Dividend (%) ");
        System.out.println("7. Exit");
        System.out.print("Enter Your Choice: ");
        no=sc.nextInt();
        switch (no) {
            case 1:
            System.out.print("Enter Dividend Amount: ");
            double D=sc.nextDouble();
            System.out.print("Enter Current Share Price: ");
            double CSP=sc.nextDouble();
            values.Dividend(D, CSP);
            break;

            case 2:
            System.out.print("Enter Dividend Yield: ");
            double DY=sc.nextDouble();
            System.out.print("Enter Current Share Price: ");
            CSP=sc.nextDouble();
            values.DividendAmount(CSP, DY);
            break;

            case 3:
            System.out.print("Enter Selling Price: ");
            double SP=sc.nextDouble();
            System.out.print("Enter Purchase Price: ");
            double PP=sc.nextDouble();
            values.Returns(PP, SP);
            break;

            case 4:
            System.out.print("Enter Selling Price: ");
            SP=sc.nextDouble();
            System.out.print("Enter Purchase Price: ");
            PP=sc.nextDouble();
            System.out.print("Enter No of Holding Years: ");
            double NY=sc.nextDouble();
            values.CompoundAnnualGrowthRate(PP, SP, NY);
            break;

            case 5:
            System.out.print("Enter Dividend Amount: ");
            double DA=sc.nextDouble();
            System.out.print("Enter Face Value: ");
            int FV=sc.nextInt();
            values.DividendPayoutPercentage(FV, DA);
            break;

            case 6:
            System.out.print("Enter Dividend Amount: ");
            DA=sc.nextDouble();
            System.out.print("Current Share Price: ");
            CSP=sc.nextDouble();
            values.dividendReturn(DA, CSP);
            break;

            case 7:
            System.exit(0);

            default:
            System.out.println("You Have Entered Invalid Choice\n\n\n");
            break;
        }
        }while(no!=7);
    }
}