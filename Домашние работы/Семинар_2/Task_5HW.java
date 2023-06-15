/*Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл. */
package Семинар_2;

import java.io.IOException;
import java.util.logging.*;
public class Task_5HW {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(Task_5HW.class.getName());
        FileHandler fh = new FileHandler("E:\\Java\\\u0417\u0430\u0434\u0430\u0447\u0438 Java\\\u0414\u043E\u043C\u0430\u0448\u043D\u0438\u0435 \u0440\u0430\u0431\u043E\u0442\u044B\\\u0421\u0435\u043C\u0438\u043D\u0430\u0440_2\\logTask5.xml");
        logger.addHandler(fh);
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);
        logger.info("Sort Array");
        int [] array = {2, 5, 1, -7, 3, 64, 0};
        printArrayInt(array);
        int[] newArr = listSort(array);
        System.out.printf("\n Отсортированный массив: \n");
        printArrayInt(newArr);
    }
    public static int[] listSort(int [] arr){
        for(int k = 0; k < arr.length-1; k++) {
            
            for (int i = 0; i < arr.length - k-1; i++){
                if (arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        return arr;
    }
     public static void printArrayInt(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            System.out.printf("%d, ", arr[i]);
        }
        System.out.print(arr[arr.length-1]);
    }
    
    public static void printArraeString(String [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}


