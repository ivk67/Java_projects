/*Вычислить n! (произведение чисел от 1 до n) */

public class Main2 {
    public static void main(String[] args) {
        int n = 5; // Задаем значение n
        int result = 1; // Инициализируем переменную для хранения результата

        for (int i = 1; i <= n; i++) {
            result *= i; // Умножаем результат на каждое число от 1 до n
        }

        System.out.println("Факториал " + n + " равен " + result);
    }
}

/*Здесь мы используем цикл for для умножения результата на каждое число от 1 до n.
Итоговый результат сохраняется в переменной `result`, и выводится на экран.*/ 
