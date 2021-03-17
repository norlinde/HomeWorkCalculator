import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        String activity;
        double answer = 0.00;


        Scanner input = new Scanner(System.in);
        System.out.println("What kind of activity would you wish to perform?");
        activity = input.next();
        System.out.println("Please enter your first number: ");
        num1 = input.nextInt();
        System.out.println("Please enter your second number: ");
        num2 = input.nextInt();


        switch (activity) {
            case "+":
                answer = num1 + num2;
                break;

            case "-":
                answer = num1 - num2;
                break;

            case "*":
                answer = num1 * num2;
                break;

            case "/":
                answer = num1 / num2;
                break;
        }
        System.out.println("The result is:");
        System.out.println(num1 + " " + activity + " " + num2 + " = " + answer);
    }
}


