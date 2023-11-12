package list;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        System.out.println("Some basic programs on ArrayList");
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(57);
        numbers.add(93);
        numbers.add(97);
        System.out.println(numbers); // Number will be print as Array
        System.out.println("Number will be print as List by Using forEach Loop");
        for (int n : numbers
        ) {
            System.out.println(n);
        }
    }
}
