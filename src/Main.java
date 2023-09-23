import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Введите первое число");
        int firstNumber = scanner.nextInt();
        System.out.println("Введите знак");
        String oops = scanner.next();
        System.out.println("Введите второе число");
        int secondNumber = scanner.nextInt();

        calculator.calculate(firstNumber, oops, secondNumber);


    }
}