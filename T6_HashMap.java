
import java.util.HashMap;

public class T6_HashMap {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // add
        map.put(1, 100);
        map.put(2, 200);
        map.put(3, 300);
        map.put(4, 400);

        // read
        System.out.println(map.get(3));

        for(int key : map.keySet()){
            System.out.println("KEY: " + key + ", Value: " + map.get(key));
        }

        // containsKey
        System.out.println(map.containsKey(1));

        // remove
        map.remove(3);
        for(int key : map.keySet()){
            System.out.println("KEY: " + key + ", Value: " + map.get(key));
        }

        
    }
}
