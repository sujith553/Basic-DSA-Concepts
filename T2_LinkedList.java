import java.util.LinkedList;

public class T2_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        // 1. create
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println("Current List: " +  list);

        // read
        System.out.println("Reading a element: " +  list.get(0));

        // update
        System.out.println("Updating a element:");
        list.set(2, 1000);
        System.out.println(list);

        // delete
        System.out.println("Deleting a element");
        list.remove(2);
        System.out.println(list);

        // size
        System.out.println("SIZE: " + list.size());

        // Traverse
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }

        // Linkedlist specific methods
        // addFirst and addLast
        System.out.println("\n Linked List Methods:");
        list.addFirst(99);
        list.addLast(99);
        System.out.println(list);

        // getFirst and getLast
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        // removeFirst and removeLast
        list.removeFirst();
        list.removeLast();
        System.out.println(list);

    }
}
