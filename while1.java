import java.util.Scanner;

public class while1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter ur name :");
        String a= sc.next();
        int i=1;
        while(i<=10){
            System.out.println(a+"="+i);
            i++;
        }
        
    }
    
}
