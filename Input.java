import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = s1.nextInt();
        System.out.print("Enter a num2: ");
        int num2 = s1.nextInt();
        System.out.println("Sum is " + (num1+num2));
        System.out.println("Diff is " + (num1-num2));
        System.out.println("Product is is " + (num1*num2));
        System.out.println("Quotient is " + ((float)num1/num2));

        s1.close();        
    }
}
