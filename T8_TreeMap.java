import java.util.TreeMap;

public class T8_TreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> map = new TreeMap<>();

        // add
        map.put(4, 400);
        map.put(1, 100);
        map.put(3, 300);
        map.put(2, 200);
        

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
