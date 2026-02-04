import java.util.Scanner;

public class user {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Name aur Age enter karo (same line): ");
        String name = sc.next();
        int age = sc.nextInt();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }    
    
}
