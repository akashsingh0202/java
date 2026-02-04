import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i , j ,k,result;
        System.out.print(" Please Enter Which table number would you like?");
        j=sc.nextInt();
        System.out.print(" Please Enter How far do you want the table to go?");
        k=sc.nextInt();
        for (i = 1; i <= k; i++) {
          result  = j * i;
          System.out.println(j + "*" + i + "=" + result);
       }

        

    }
}
