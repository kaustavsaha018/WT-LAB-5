import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the mark: ");
        float mark = sc.nextFloat();
        sc.close();
        
        if(mark>=90){
            System.out.println("O Grade");
        }
        else if(mark<90 && mark>=80){
            System.out.println("E Grade");
        }
        else if(mark<80 && mark>=70){
            System.out.println("A Grade");
        }
        else if(mark<70 && mark>=60){
            System.out.println("B Grade");
        }
        else if(mark<60 && mark>=50){
            System.out.println("C Grade");
        }
        else if(mark<50 && mark>=40){
            System.out.println("D Grade");
        }
        else{
            System.out.println("F Grade");
        }
    }
}
