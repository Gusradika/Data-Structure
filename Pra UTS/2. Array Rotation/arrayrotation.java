public class arrayrotation {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[5];// alokasi memori 5
        arr[0] = 10;// elemen pertama array
        arr[1] = 20;// elemen kedua array
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        // menampilkan isi array
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Elemen di setiap index [" + i + "] : " + arr[i]);
        }
    }
}
