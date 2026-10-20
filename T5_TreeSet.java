import java.util.TreeSet;

public class T5_TreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

        // add
        set.add(10);
        set.add(67);
        set.add(10);
        set.add(43);
        set.add(27);
        System.out.println(set);

        // remove
        set.remove(67);
        System.out.println(set);

        // contains - true or false
        System.out.println(set.contains(10));

        // size
        System.out.println(set.size());
        
        // clear
        set.clear();
        System.out.println(set);   
    }
}
