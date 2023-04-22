package list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ListHandler {

    public static void printList(List<String> stringList) {
        for (String temp : stringList) {
            System.out.print(temp + " ");
        }
        System.out.println("\n");
    }

    public static List<String> enterList() {
        Scanner scanner = new Scanner(System.in);
        List<String> stringList = new ArrayList<>();

        System.out.println("Enter 5 words with enter:");
        for (int i = 0; i < 5; i++) {
            stringList.add(scanner.nextLine());
        }
        return stringList;
    }


    public static List<String> doubleValues(List<String> list) {
        List<String> dubbedList = new ArrayList<>(list);
        for (int i = 0; i < list.size(); i++) {
            dubbedList.add((i + (i + 1)), list.get(i));
        }
        return dubbedList;

    }

    public static List<String> doubleValuesWithLambda(List<String> list) {
        List<String> dubbedList = new ArrayList<>(list);
        IntStream.iterate(0, i -> i + 2)
                .limit(dubbedList.size())
                .forEach(i -> dubbedList.add(i, dubbedList.get(i)));
        return dubbedList;
    }

    public static List<String> doubleValuesWithListIterator(List<String> list) {
        List<String> dubbedList = new ArrayList<>(list);
        ListIterator<String> iterator = dubbedList.listIterator();
        while (iterator.hasNext()) {
            iterator.add(iterator.next());
        }
        return dubbedList;
    }

    public static List<String> doubleValuesWithLambdaFlatmap(List<String> list) {
        return list.stream()
                .flatMap(s -> Stream.of(s, s))
                .collect(Collectors.toList());
    }
}
