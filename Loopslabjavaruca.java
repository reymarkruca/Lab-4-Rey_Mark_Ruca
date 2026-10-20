/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loopslabjavaruca;
import java.util.Scanner;
/**
 *
 * @author Rey Mark S. Ruca
 */
public class Loopslabjavaruca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" === Activity 1: Multiplication Table Generator === ");
        activity1(scanner);
        System.out.println();

        System.out.println(" === Activity 2: Sum of Natural Numbers === ");
        activity2(scanner);
        System.out.println();

        System.out.println(" === Activity 3: Factorial Calculator === ");
        activity3(scanner);
        System.out.println();

        System.out.println(" === Activity 4: Even and Odd Numbers === ");
        activity4(scanner);
        System.out.println();

        System.out.println(" === Activity 5: Reverse Digits of a Number === ");
        activity5(scanner);

        scanner.close();
    }

    // Activity 1: Multiplication Table Generator (for loop) 
    public static void activity1(Scanner scanner) {
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    // Activity 2: Sum of Natural Numbers (while loop)
    public static void activity2(Scanner scanner) {
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println("Sum = " + sum);
    }

    //  Activity 3: Factorial Calculator (do-while loop)
    public static void activity3(Scanner scanner) {
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        long factorial = 1;
        int i = 1;

        if (n > 0) {
            do {
                factorial *= i;
                i++;
            } while (i <= n);
        }
        System.out.println("Factorial = " + factorial);
    }

    // Activity 4: Even and Odd Numbers (for loop)
    public static void activity4(Scanner scanner) {
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        System.out.print("Even numbers: ");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        System.out.print("Odd numbers: ");
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    //  Activity 5: Reverse Digits of a Number (while loop)
    public static void activity5(Scanner scanner) {
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int reversed = 0;
        int temp = Math.abs(num); // Handles absolute value calculation safely

        while (temp > 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }

        // Preserve negative signs if present in input
        if (num < 0) {
            reversed = -reversed;
        }

        System.out.println("Reversed: " + reversed);
    }
}
