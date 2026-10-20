
import java.util.ArrayList;
import java.util.Collections;

public class T11_Important_Methods {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(85);
        list.add(78);
        list.add(90);
        list.add(86);
        list.add(98);

        System.out.println("Original: " + list);

        // sort
        Collections.sort(list);
        System.out.println("Sorted: " + list);

        // desc sort
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("DESCENDING Sorted: " + list);

        // swap
        Collections.swap(list, 0, 4);
        System.out.println("After Swap: " + list);

        // frequency
        System.out.println("Frequency of 90: " + Collections.frequency(list, 90));

        // min and max
        System.out.println("Minimum: " + Collections.min(list));
        System.out.println("Maximum: " + Collections.max(list));

        // search
        System.out.println("Position of 98: " + Collections.binarySearch(list, 98));

    }

}
