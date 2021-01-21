import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your First Name: ");
        String first_name = sc.nextLine();
        System.out.print("Enter your Last Name: ");
        String last_name = sc.nextLine();
        sc.close();
        
        System.out.println(last_name + " " + first_name); 
    }
}
