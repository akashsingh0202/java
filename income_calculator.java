import java.util.Scanner;
public class income_calculator {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter income =");
        Double income=sc.nextDouble();
        Double tax = 0.00;
        if (income<=0)
        {
            System.out.println("invalid income");
        }
        else if(income<=300000)
        {
            System.out.println("your tax amount" +tax);
        }
        else if (income>300000 && income<=500000) {
            tax=(income*5)/100;
            System.out.println("your tax amount is "+tax);
        }
        else if (income>500000 && income<=1000000) {
            tax=(income*10)/100;
             System.out.println("your tax amount is "+tax);
        }
        else
        {
            tax=(income*20)/100;
            System.out.println("your tax amount is "+tax);
        }
        sc.close();
        
    }
    
}
