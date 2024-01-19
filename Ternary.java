import java.util.Scanner;

public class Ternary {
        public static void main(String[] args) {

            Scanner obj = new Scanner(System.in);
            System.out.println("Please enter the age: ");

            int age =obj.nextInt();

            String result =  (age >= 20) ? "Yes" : "No";
            
            System.out.println("Your are eligible: " + result);
        }
    }
