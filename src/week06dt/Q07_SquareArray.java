package week06dt;

import java.util.Arrays;
import java.util.Scanner;

public class Q07_SquareArray {
    /*
    Ask user to enter an integer, and create a squared multi dimensional Array
		Example: If user enters 3 ==> [[3, 3, 3],
									   [3, 3, 3],
	  								   [3, 3, 3]]
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer");
        int length = scan.nextInt();
        int arr[][] = new int[length][length];

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                arr[i][j] = length;
            }
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println(Arrays.deepToString(arr));

    }
}
