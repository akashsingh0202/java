import java.util.Scanner;

public class table3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i , j ,k ,res;
        System.out.print("Please Enter Which table number would you like?");
        j=sc.nextInt();
        System.out.println("Please Enter How far do you want the table to go?");
        k=sc.nextInt();
        i=1;
        do{
            res=j*i;
            System.out.println(j + "*" + i + "=" + res);
            i++;
        }
        while(i<=k);

    }
    
}
