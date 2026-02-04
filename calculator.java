import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a;
        double num1,num2,result;
        System.out.println("welcome to our calculator");
        System.out.println("press 1 for addition :");
        System.out.println("press 2 for substraction:");
        System.out.println("press 3 for multiplication:");
        System.out.println("press 4 for division:");
        System.out.print("please press the number = ");
        a=sc.nextInt();
        
        switch (a) {
            case 1:
                
                System.out.println("you choose addition:");
                System.out.println("please enter the first number ");
                num1 = sc.nextDouble();
                System.out.println("please enter the second number");
                num2 = sc.nextDouble();
                result=num1+num2;
                System.out.println("the result is : " + result);
                break;
            case 2:
                
                System.out.println("you choose Substraction:");
                System.out.println("please enter the first number ");
                num1 = sc.nextDouble();
                System.out.println("please enter the second number");
                num2 = sc.nextDouble();
                result=num1-num2;
                System.out.println("the result is : " + result);
                break;
            case 3:
                
                System.out.println("you choose Multiplication:");
                System.out.println("please enter the first number ");
                num1 = sc.nextDouble();
                System.out.println("please enter the second number");
                num2 = sc.nextDouble();
                result=num1*num2;
                System.out.println("the result is : " + result);
                break;    
            case 4:
                
                System.out.println("you choose Division:");
                System.out.println("please enter the first number ");
                num1 = sc.nextDouble();
                System.out.println("please enter the second number");
                num2 = sc.nextDouble();
                result=num1/num2;
                System.out.println("the result is : " + result);
                break;
            default:
                System.out.println("please press valid number");
                break;
        }

    }
}
