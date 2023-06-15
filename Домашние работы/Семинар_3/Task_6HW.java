/*Пусть дан произвольный список целых чисел.
1) Нужно удалить из него чётные числа
2) Найти минимальное значение
3) Найти максимальное значение
4) Найти среднее значение */
package Семинар_3;

import java.util.ArrayList;

public class Task_6HW {
    public class lib {
        public static void PrintArray(ArrayList<Integer> arr) { 
            for (int element : arr) {
                System.out.printf("%d, ", element);
            }
            System.out.println();
        }

        public static ArrayList<Integer> FillRandomArray(int n) { 
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add((int) (Math.random() * 100));
            }
            return list;
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array = lib.FillRandomArray(10);
        lib.PrintArray(array);
        DeleteEvenNumber(array);
        lib.PrintArray(array);
        int maxElement = findMax(array);
        int minElement = findMin(array);
        Double avgElement = findAvg(array);
        System.out.printf("Максимальный элемент: %d \n", maxElement);
        System.out.printf("Минимальный элемент: %d \n", minElement);
        System.out.printf("Среднее арифметическое: %.1f \n", avgElement);
    }
    public static void DeleteEvenNumber(ArrayList<Integer> list) {
        int i = 0;
        while (i < list.size()) {
            if (list.get(i) % 2 == 0)
                list.remove(i);
            else
                i++;
        }
    }
    public static int findMax(ArrayList<Integer> arr){
        int max = arr.get(0);
        for(int element : arr){
            if(element > max) max = element;
        }
        return max;
    }
    public static int findMin(ArrayList<Integer> arr){
        int min = arr.get(0);
        for(int element : arr){
            if(element < min) min = element;
        }
        return min;
    }
    public static Double findAvg(ArrayList<Integer> arr){
        int sum = 0;
        for(int element : arr){
            sum += element;
        }
        Double avg = Double.valueOf(sum)/Double.valueOf(arr.size());
        return avg;
    }
}
