import java.util.*;
import java.text.DecimalFormat;
public class Currency 
{
    public static void main(String[] args) 
        {
            double rupee,dollar,pound,code,euro,yen;
            DecimalFormat f = new DecimalFormat("##.###");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the currency code \n1:Rupees\n2:Dollar\n3:Pound\n4:Euro2"); 
            code=sc.nextInt();
            if(code == 1)
            {
                System.out.println("Enter amount in rupees");
                rupee = sc.nextFloat();
                dollar = rupee / 66;
                System.out.println("Dollar : "+f.format(dollar));
                pound = rupee / 98;
                System.out.println("Pound : "+f.format(pound));
                euro = rupee / 72;
                System.out.println("Euro : "+f.format(euro));
                
            }
            //For Dollar Conversion
            else if (code == 2)
            {
                System.out.println("Enter amount in dollar");
                dollar = sc.nextFloat();
                rupee = dollar * 66;
                System.out.println("Rupees : "+f.format(rupee));
                pound = dollar * 0.67;
                System.out.println("Pound : "+f.format(pound));
                euro = dollar * 0.92;
                System.out.println("Euro : "+f.format(euro));
                
            }
            //For Pound Conversion
            else if(code == 3)
            {
                System.out.println("Enter amount in Pound");
                pound = sc.nextFloat();
                rupee = pound * 98;
                System.out.println("Rupees : "+f.format(rupee));
                dollar = pound * 1.49;
                System.out.println("Dollar : "+f.format(dollar));
                euro = pound * 1.36;
                System.out.println("Euro : "+f.format(euro));
                
            }
            //For Euro Conversion
            else if(code == 4)
            {
                System.out.println("Enter amount in Euro");
                euro = sc.nextFloat();
                rupee = euro * 72;
                System.out.println("Rupees : "+f.format(rupee));
                dollar = euro * 1.09;
                System.out.println("Dollar : "+f.format(dollar));
                pound = euro * 0.73;
                System.out.println("Pound : "+f.format(pound));
                
            }
            else
                System.out.println("Invalid Code");
    }
}
