package CodeWars;

import java.sql.Array;

public class Sequence {
    public static int[] reverse(int n) {
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = n;
            n--;

        }



        return arr;
    }

}