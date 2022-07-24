import java.util.ArrayList;

public class arraylist {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> kode = new ArrayList<String>();
        kode.add("m001");
        kode.add("m002");
        kode.add("m003");
        kode.add("m004");
        System.out.println(kode);
        // access an item
        System.out.println(kode.get(2));
        // change an item
        kode.set(0, "M001");
        System.out.println(kode);

        // Remove an Item and for remove all clear()
        kode.remove(0);
        System.out.println(kode);

        // ArrayList Size
        System.out.println(kode.size());
        // get element arraylist with loop
        for (int i = 0; i < kode.size(); i++) {
            System.out.println(kode.get(i));
        }

        // get element arraylist with for each

        for (String i : kode) {
            System.out.println(i);
        }

    }
}