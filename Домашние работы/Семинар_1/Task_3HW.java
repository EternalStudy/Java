package Семинар_1;
/*Реализовать простой калькулятор
+ - / *
Введите первое число: A \n
Введите знак: *
Введите второе число: B
Результат: A*B
sc.next() -- считывает символ
sc.nextLine() -- считывает всю строчку
sc.nextInt() -- считывает число, но без перехода на след. строчку*/

import java.util.Scanner;

public class Task_3HW {
    static int getSum(int a, int b) {
        return a + b;
    }

    static int getSubstract(int a, int b) {
        return a - b;
    }

    static int getProduct(int a, int b) {
        return a * b;
    }

    static double getDiv(int a, int b) {
        return (double) a / (double) b;
    }

    public static void PrintResult(int a, int b, String Operation) {
        switch (Operation) {
            case "+":
                System.out.printf("%d %s %d = %d \n", a, Operation, b, getSum(a, b));
                break;
            case "-":
                System.out.printf("%d %s %d = %d \n", a, Operation, b, getSubstract(a, b));
                break;
            case "*":
                System.out.printf("%d %s %d = %d \n", a, Operation, b, getProduct(a, b));
                break;
            case "/":
                if (b != 0) {
                    System.out.printf("%d %s %d = %.4f \n", a, Operation, b, getDiv(a, b));
                } else {
                    System.out.println("ERROR: division by zero!!!");
                }
                break;
        }
    }

    /**
     * @param args
     */
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        int a = 0;
        if (!scn.hasNextInt()){
            System.out.printf("Вы ввели не цифру");
        }
        else{
            a = scn.nextInt();
            Scanner sc = new Scanner(System.in);
            System.out.printf("Выберите операцию: +, -, *, / \n");
            String Operation = "";
            if(sc.hasNextLine()){
                Operation = sc.nextLine();
            }
            if ((Operation.equals("+") || Operation.equals("-") || Operation.equals("*")
                    || Operation.equals("/"))){
                        int b = 0;
                        System.out.printf("Введите второе число: ");
                        if (!scn.hasNextInt()){
                             System.out.printf("Вы ввели не цифру");
                        }
                        else{
                            b = scn.nextInt();
                        PrintResult(a, b,Operation);
                        }
            } else {
                System.out.println("You entered wrong operation!!!");
            }
            scn.close();
            sc.close();
            
        }
    }
}

