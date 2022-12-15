package list;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Апельсини");
        stringList.add("Мандарини");
        stringList.add("І мигдаль");
        System.out.println("Початковий список:");
        for (String temp : stringList) {
            System.out.println(temp);
        }
        System.out.println("Продубльований список:");
        List<String> stringListDouble = ListDuplicate.doubleValues(stringList);
        for (String temp : stringListDouble) {
            System.out.println(temp);
        }

    }
}
