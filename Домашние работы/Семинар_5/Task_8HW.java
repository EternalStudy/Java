/* Реализуйте структуру телефонной книги с помощью HashMap.
Программа также должна учитывать, что во входной структуре 
будут повторяющиеся имена с разными телефонами, их необходимо 
считать, как одного человека с разными телефонами. Вывод должен 
быть отсортирован по убыванию числа телефонов.

Пример:
Иванов 1231234
Иванов 3456345
Иванов 5676585
Петров 12345
Петров 82332*/
package Семинар_5;

import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
import java.util.List;

public class Task_8HW {
    public static Map<String, List<String>> phoneBook = new HashMap<>();

    public static void main(String[] args) {
        addPerson();
        Scanner sc = new Scanner(System.in);
        System.out.print("Имя: ");
        String str = sc.nextLine();
        sc.close();
        findPerson(str);
    }

    public static void addPerson() {
        phoneBook.put("Kate", List.of("111", "222"));
        phoneBook.put("Ann", List.of("333", "444"));
        phoneBook.put("Vic", List.of("555"));
        phoneBook.put("Masha", List.of("666", "777"));
        phoneBook.put("Alise", List.of("888", "999"));
        phoneBook.put("Kate", List.of("555", "245"));
        phoneBook.put("Ann", List.of("234", "4345"));
        phoneBook.put("Vic", List.of("545"));
        phoneBook.put("Masha", List.of("663456", "777345"));
        phoneBook.put("Alise", List.of("8245825238", "923492349"));

    }

    public static void findPerson(String surname) {
        System.out.printf("%s: %s", surname, phoneBook.get(surname));
    }
}