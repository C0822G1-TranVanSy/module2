package ss11_stack_queue.exercise.exercise2;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class CountingString {
    public static void main(String[] args) {
        TreeMap<String, Integer> stringTreeMap = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi cần kiểm tra: ");
        String string = scanner.nextLine();

        String[] strings = string.toUpperCase().split(" ");

        for (String key : strings) {
            if (!stringTreeMap.containsKey(key)) {
                stringTreeMap.put(key, 1);
            } else {
                int count = stringTreeMap.get(key);
                stringTreeMap.put(key, count + 1);
            }
        }
        System.out.println(stringTreeMap);

        Set<String> stringSet = stringTreeMap.keySet();
        System.out.println("\nSố lần xuất hiện của mỗi từ trong chuỗi là: ");
        for (String key : stringSet) {
            System.out.println(key + ": " + stringTreeMap.get(key));
        }
    }


}
