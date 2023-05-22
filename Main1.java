/*Вычислить n-ое треугольное число (сумма чисел от 1 до n) */

public class Main1 {
    public static void main(String[] args) {
        int n = 5; // здесь можно задать нужное значение n
        int triangleNumber = 0;
        for (int i = 1; i <= n; i++) {
            triangleNumber += i;
        }
        System.out.println("Треугольное число для n = " + n + " равно " + triangleNumber);
    }
}

/*В этом примере мы используем цикл for, чтобы пройти по всем числам от 1 до n и добавить
 их в переменную triangleNumber Затем мы выводим результат на экран с помощью метода println(). 
 Вы можете изменить значение переменной n` на нужное вам число и запустить код, чтобы вычислить 
 соответствующее треугольное число.
*/