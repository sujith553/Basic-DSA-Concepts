import java.util.HashSet;


public class T3_HashSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

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
