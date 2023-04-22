package list;

import java.util.ArrayList;
import java.util.List;

/**
 *Використовуючи колекцію, підвійте слово:
 * 1. Введіть із клавіатури 5 слів до списку рядків.
 * 2. Метод doubleValues повинен підвоювати слова за принципом a, b, c -> a, a, b, b, c, c.
 * 3. Використовуючи цикл for виведіть результат на екран, кожне значення нового рядка.
 */

public class Main {
    public static void main(String[] args) {
        List<String> stringList = ListHandler.enterList();
        System.out.println("Initial list:");
        ListHandler.printList(stringList);

        System.out.println("Duplicate list:");
        ListHandler.printList(ListHandler.doubleValues(stringList));

        System.out.println("Duplicate list with Lambda and IntStream:");
        ListHandler.printList(ListHandler.doubleValuesWithLambda(stringList));

        System.out.println("Duplicate list with ListIterator:");
        ListHandler.printList(ListHandler.doubleValuesWithListIterator(stringList));

        System.out.println("Duplicate list with Lambda and Flatmap:");
        ListHandler.printList(ListHandler.doubleValuesWithLambdaFlatmap(stringList));
    }

}
