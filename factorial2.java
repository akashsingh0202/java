import java.util.Scanner;

public class factorial2 {
    public static void main(String[] args) {
        int a,i;
        Scanner sc= new Scanner(System.in);
        long fact=1;
        System.out.print("enter the number whose factorial you want");
        a=sc.nextInt();
        i=1;
        while (i<=a) {
            fact=fact*i;
            i++;
        }
        System.out.println("the factorial is:" +fact);
    }
}
