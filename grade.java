import java.util.*;
public class grade {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter the number");
        int b=a.nextInt();
        if (b>75&&b<=100){
            System.out.println("A grade");
        }
        else if (b<75&&b>50){
            System.out.println("B Grade");
        }
        else if (b<50&&b>35){
            System.out.println("C Grade");
        }else if (b<35&&b==0){
            System.out.println("Fail");
        }
        else{
            System.out.println("invalid marks please re enter");
        }
        a.close();
        
    }
    
}
