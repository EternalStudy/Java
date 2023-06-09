import java.util.Scanner;

/**
 * Написать программу, которая запросит пользователя ввести 
 * имя в консоли, получит введенную строку и выведет в консоль сообщение "Привет, Имя!"
 */

public class Task_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "cp866");
        System.out.printf("Введите имя: ");
        String name = sc.nextLine();
        System.out.printf("Привет, %s", name);    
    }
}