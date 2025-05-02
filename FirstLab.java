import java.util.Scanner; 

public class FirstLab {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = input.nextInt();

        System.out.print("Enter the second number: ");
        int b = input.nextInt();

        int addition = a + b;
        int subtraction = a - b;
        int multiplication = a * b;
        double division = (double) a / b;  

        System.out.println("Sum: " + addition);
        System.out.println("Difference: " + subtraction);
        System.out.println("Product: " + multiplication);
        System.out.println("Quotient: " + division);

        input.close();
    }
}


