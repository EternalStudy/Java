/*Написать метод, который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди. */
package Семинар_3;

import java.util.LinkedList;
import java.util.Queue;

public class Task_11 {
    public static void main(String[] args) {
        String[] arr = { "wer", "fbf", "dsd", "wefw", "wghhgn", "qwe" };
        System.out.println(printQueue(arr));

    }

    public static Queue<String> printQueue(String[] arr) {
        Queue<String> qs = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            // qs.add(arr[i]);
            qs.offer(arr[i]);
        }
        return qs;
    }
}
