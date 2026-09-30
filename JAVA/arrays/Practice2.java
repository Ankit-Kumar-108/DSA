import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int [2][3] ;
        System.out.println("Lenght "+ arr.length);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
               
            }
        }
    }
}
