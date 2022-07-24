import java.util.Scanner;

public class array2d {

    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr[1].length; j++) {
                System.out.print("Input : ");
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("Printing...");

        for (int i = 0; i < arr[0].length; i++) {
            System.out.println("");
            for (int j = 0; j < arr[1].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
        }

    }
}