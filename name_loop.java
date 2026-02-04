import java.util.Scanner;

public class name_loop {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter your name :");
        String a=sc.next();
        for(int i=1;i<=10;i++){
            System.out.println(a+" "+i);
        }
    }
    
}
