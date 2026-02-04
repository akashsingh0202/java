import java.util.Scanner;

public class factorial3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,i;
        long fact=1;
        System.out.print("enter the number");
        a=sc.nextInt();
        i=1;
        do{
            fact=fact*i;
            i++;
        }
        while(i<=a);
        System.out.println("the factorial of "+a+"is"+fact);

    }
    
}
