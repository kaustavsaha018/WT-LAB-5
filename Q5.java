import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();
        
        int original_num=num;
        int rev_num=0;
        while(num!=0){
            int temp = num%10;
            rev_num = (rev_num*10)+temp;
            num = num/10;
        }
        
        if(original_num==rev_num){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
