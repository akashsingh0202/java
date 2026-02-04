import java.util.Scanner;

public class table2 {
    public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
     int a ,res ,i,num;
     System.out.print("Please Enter Which table number would you like?");   
     a=sc.nextInt();
     System.out.print("Please Enter How far do you want the table to go?");
     num=sc.nextInt();
     i=1;
     while (i<=num) {
        res=i*a;
        System.out.println(a+"x"+i+"="+res);
        i++;
     }
    }
}
