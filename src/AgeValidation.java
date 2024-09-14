import java.util.Scanner;

public class AgeValidation {

    final static int AGE_LIMIT = 18;   
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese su edad: ");
        int age = scanner.nextInt();
        
        System.out.println("Tienes " + age + " años.");

        if (age >= AGE_LIMIT) {
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied");
        }

        scanner.close();
    }
}
