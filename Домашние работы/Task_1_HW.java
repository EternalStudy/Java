
/*Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n) */
import java.util.Scanner;

public class Task_1_HW {
    static int getTriangleNumber(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i + 1;
        }
        return sum;
    }

    static int getFactorial(int n) {
        int result = 1;
        for (int i = 0; i < 1; i++) {
            result *= i + 1;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = 0;
        System.out.println("Введите натуральное число: ");
        if (!scn.hasNextInt()) {
            System.out.println("Вы ввели неверное число!!!");
        } else {
            n = scn.nextInt();
            if (n < 1)
                System.out.println("Введите положительное число");
            else {
                System.out.printf("Треугольное число", n, getTriangleNumber(n));
                System.out.println();
                System.out.printf("Факториал числа", n, getFactorial(n));
            }
        }
    }
}