package Cеминар_1;
public class Task_4 {
    public static void main(String[] args) {
        String str = "Добро пожаловать на курс по Java";
        String[] words = str.split(" ");
        for (int i = words.length - 1; i >= 0; i--){
            System.out.println(words[i]);
        }
    }
}