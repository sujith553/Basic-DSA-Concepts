import java.util.LinkedHashMap;

public class T7_LinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();

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
