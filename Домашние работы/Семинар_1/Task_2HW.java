package Семинар_1;
/*Вывести все простые числа от 1 до 1000 */

public class Task_2HW {
    public static void main(String[] args) {
        StringBuilder x = new StringBuilder();
        x = x.append("1");
        for (int i = 0; i < 1; i++) {
            for (int j = 2; j < 1000; j++) {
                if (j % 2 != 0)
                    x = x.append(", ").append(j);
            }
            System.out.println(x);
        }
        System.out.println("Простые числа от 1 до 1000:");
    }
}
