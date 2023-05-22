/*Реализовать простой калькулятор (введите первое число, введите второе число, введите требуемую операцию, ответ) */
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        System.out.print("Введите операцию (+, -, *, /): ");
        String operation = scanner.next();

        double result = 0;

        switch (operation) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            default:
                System.out.println("Неправильная операция");
                break;
        }

        System.out.println("Результат: " + result);

        scanner.close();
    }
}
/*Этот код запрашивает у пользователя два числа и операцию, которую нужно выполнить между ними.
 Затем он использует оператор switch для выполнения нужной операции и выводит результат на экран. */
