import java.util.LinkedList;

/**
 *
 * @author User
 */
public class linkedlist {
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<String> kode = new LinkedList<String>();
        kode.add("M001");
        kode.add("M002");
        kode.add("M003");
        kode.add("M004");
        System.out.println(kode);
        // Use addFirst() to add the item to the beginning
        kode.addFirst("M000");
        System.out.println(kode);

        // Use addLast() to add the item to the end
        kode.addLast("M006");
        System.out.println(kode);

        // Use removeFirst() remove the first item from the list
        kode.removeFirst();
        System.out.println(kode);
        // Use removeLast() remove the last item from the list
        kode.removeLast();
        System.out.println(kode);
        // Use getFirst() to display the first item in the list
        System.out.println(kode.getFirst());
        // Use getLast() to display the last item in the list
        System.out.println(kode.getLast());

    }
}