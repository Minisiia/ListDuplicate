package list;

import java.util.ArrayList;
import java.util.List;

public class ListDuplicate {

    public static <E> List<E> doubleValues(List<E> list) {
        List<E> doubleList = new ArrayList<>();
        doubleList.addAll(list);
        for (int i = 0; i < list.size(); i++) {
            doubleList.add((i + (i + 1)), list.get(i));
        }
        return doubleList;
    }

}
